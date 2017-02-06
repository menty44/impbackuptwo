/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.eclipse.webdav.internal.kernel.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * A generic date and time object. It uses UTC as the timezone and US as the locale.
 */

public class DateTime {
    protected SimpleDateFormat dateFormat;
    protected long dateTime;

    protected static final String RFC_1123_PATTERN = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"; //$NON-NLS-1$
    protected static final String RFC_850_PATTERN = "E, dd-MMM-yyyy HH:mm:ss 'GMT'"; //$NON-NLS-1$
    protected static final String ASCTIME_PATTERN = "EEE MMM dd HH:mm:ss yyyy"; //$NON-NLS-1$
    protected static final String ISO_8601_UTC_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'"; //$NON-NLS-1$
    protected static final String ISO_8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ssz"; //$NON-NLS-1$
    protected static final String ISO_8601_UTC_MILLIS_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"; //$NON-NLS-1$
    protected static final String ISO_8601_MILLIS_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSz"; //$NON-NLS-1$

    public DateTime() {
        this(0);
    }

    /**
     * Starts this object from a java long format (milliseconds).
     */
    public DateTime(long date) {
        setDateTime(date);
        dateFormat = new SimpleDateFormat();
        dateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US)); //$NON-NLS-1$
    }

    public boolean after(DateTime other) {
        return getDateTime() > other.getDateTime();
    }

    public boolean before(DateTime other) {
        return getDateTime() < other.getDateTime();
    }

    public boolean equals(DateTime other) {
        return getDateTime() == other.getDateTime();
    }

    /**
     * Milliseconds since 1 January 1970 0:00 UTC.
     */
    public long getDateTime() {
        return dateTime;
    }

    public int getMilliseconds() {
        return (int) (getDateTime() % 1000);
    }

    /**
     * Sets the date and time from a java long format (milliseconds).
     */
    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Do nothing if date format is not supported
     */
    public void setDateTime(String date) {
        String[] patterns = {RFC_1123_PATTERN, ISO_8601_UTC_PATTERN, ISO_8601_UTC_MILLIS_PATTERN, ISO_8601_PATTERN, ISO_8601_MILLIS_PATTERN, RFC_850_PATTERN, ASCTIME_PATTERN};
        for (int i = 0; i < patterns.length; i++) {
            if (setDateTime(date, patterns[i]))
                break;
        }
    }

    /**
     * Do nothing if date format is not supported.
     */
    protected boolean setDateTime(String date, String pattern) {
        boolean dateChanged = true;
        dateFormat.applyPattern(pattern);
        try {
            setDateTime(dateFormat.parse(date));
        } catch (ParseException e) {
            dateChanged = false;
        }
        return dateChanged;
    }

    public void setDateTime(Date date) {
        dateTime = date.getTime();
    }

    public Date toDate() {
        return new Date(dateTime);
    }

    public String toISO8601() {
        if (getMilliseconds() == 0)
            return toString(ISO_8601_UTC_PATTERN);
        return toString(ISO_8601_UTC_MILLIS_PATTERN);
    }

    public String toRFC1123() {
        return toString(RFC_1123_PATTERN);
    }

    /**
     * Returns on a RFC 1123 format.
     */
    public String toString() {
        return toRFC1123();
    }

    protected String toString(String pattern) {
        dateFormat.applyPattern(pattern);
        return dateFormat.format(toDate());
    }
}
