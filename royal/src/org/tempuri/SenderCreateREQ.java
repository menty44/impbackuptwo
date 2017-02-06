/**
 * SenderCreateREQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SenderCreateREQ  implements java.io.Serializable {
    private org.tempuri.Authenticate credentials;

    private int customerNo;

    private java.lang.String senderFirstName;

    private java.lang.String senderLastName;

    private java.util.Calendar senderDOB;

    private java.lang.String senderGender;

    private java.lang.String senderAddress;

    private java.lang.String senderPostorZipCode;

    private java.lang.String senderStateorCounty;

    private java.lang.String senderCountryCode;

    private java.lang.String senderTelephone;

    private int senderDocType;

    private java.lang.String senderDOC;

    private java.util.Calendar senderDOCDateOfIssue;

    private java.util.Calendar senderDOCDateOfExpiry;

    private java.lang.String senderDOCCountryOfIssue;

    private java.lang.String senderPlaceOfBirth;

    private java.lang.String senderOccupation;

    private java.lang.String senderSocialSecurityNo;

    private java.lang.String senderStateOfIssue;

    private java.lang.String senderNationality;

    private int receiverNo;

    private java.lang.String receiverFirstName;

    private java.lang.String receiverLastName;

    private java.util.Calendar receiverDOB;

    private java.lang.String receiverGender;

    private java.lang.String receiverAddress;

    private java.lang.String receiverPostorZipCode;

    private java.lang.String receiverStateorCounty;

    private java.lang.String receiverCountryCode;

    private java.lang.String receiverTelephone;

    private java.lang.String receiverEmail;

    private int receiverDocType;

    private java.lang.String receiverDOC;

    private java.util.Calendar receiverDOCDateOfIssue;

    private java.util.Calendar receiverDOCDateOfExpiry;

    private java.lang.String receiverDOCCountryOfIssue;

    private java.lang.String receiverPlaceOfBirth;

    private java.lang.String testQuestion;

    private java.lang.String testAnswer;

    private java.lang.String reasonForPayment;

    private java.lang.String sourceOfFund;

    private java.lang.String bankAccount;

    private java.lang.String bank;

    private java.lang.String localBankCode;

    private java.lang.String bankBranch;

    private java.lang.String bankAddress;

    private java.lang.String bankCity;

    private java.lang.String IBAN;

    private java.lang.String bankState;

    private java.lang.String bankCountry;

    private java.lang.String CPFNumber;

    private java.lang.String bankAccountType;

    public SenderCreateREQ() {
    }

    public SenderCreateREQ(
           org.tempuri.Authenticate credentials,
           int customerNo,
           java.lang.String senderFirstName,
           java.lang.String senderLastName,
           java.util.Calendar senderDOB,
           java.lang.String senderGender,
           java.lang.String senderAddress,
           java.lang.String senderPostorZipCode,
           java.lang.String senderStateorCounty,
           java.lang.String senderCountryCode,
           java.lang.String senderTelephone,
           int senderDocType,
           java.lang.String senderDOC,
           java.util.Calendar senderDOCDateOfIssue,
           java.util.Calendar senderDOCDateOfExpiry,
           java.lang.String senderDOCCountryOfIssue,
           java.lang.String senderPlaceOfBirth,
           java.lang.String senderOccupation,
           java.lang.String senderSocialSecurityNo,
           java.lang.String senderStateOfIssue,
           java.lang.String senderNationality,
           int receiverNo,
           java.lang.String receiverFirstName,
           java.lang.String receiverLastName,
           java.util.Calendar receiverDOB,
           java.lang.String receiverGender,
           java.lang.String receiverAddress,
           java.lang.String receiverPostorZipCode,
           java.lang.String receiverStateorCounty,
           java.lang.String receiverCountryCode,
           java.lang.String receiverTelephone,
           java.lang.String receiverEmail,
           int receiverDocType,
           java.lang.String receiverDOC,
           java.util.Calendar receiverDOCDateOfIssue,
           java.util.Calendar receiverDOCDateOfExpiry,
           java.lang.String receiverDOCCountryOfIssue,
           java.lang.String receiverPlaceOfBirth,
           java.lang.String testQuestion,
           java.lang.String testAnswer,
           java.lang.String reasonForPayment,
           java.lang.String sourceOfFund,
           java.lang.String bankAccount,
           java.lang.String bank,
           java.lang.String localBankCode,
           java.lang.String bankBranch,
           java.lang.String bankAddress,
           java.lang.String bankCity,
           java.lang.String IBAN,
           java.lang.String bankState,
           java.lang.String bankCountry,
           java.lang.String CPFNumber,
           java.lang.String bankAccountType) {
           this.credentials = credentials;
           this.customerNo = customerNo;
           this.senderFirstName = senderFirstName;
           this.senderLastName = senderLastName;
           this.senderDOB = senderDOB;
           this.senderGender = senderGender;
           this.senderAddress = senderAddress;
           this.senderPostorZipCode = senderPostorZipCode;
           this.senderStateorCounty = senderStateorCounty;
           this.senderCountryCode = senderCountryCode;
           this.senderTelephone = senderTelephone;
           this.senderDocType = senderDocType;
           this.senderDOC = senderDOC;
           this.senderDOCDateOfIssue = senderDOCDateOfIssue;
           this.senderDOCDateOfExpiry = senderDOCDateOfExpiry;
           this.senderDOCCountryOfIssue = senderDOCCountryOfIssue;
           this.senderPlaceOfBirth = senderPlaceOfBirth;
           this.senderOccupation = senderOccupation;
           this.senderSocialSecurityNo = senderSocialSecurityNo;
           this.senderStateOfIssue = senderStateOfIssue;
           this.senderNationality = senderNationality;
           this.receiverNo = receiverNo;
           this.receiverFirstName = receiverFirstName;
           this.receiverLastName = receiverLastName;
           this.receiverDOB = receiverDOB;
           this.receiverGender = receiverGender;
           this.receiverAddress = receiverAddress;
           this.receiverPostorZipCode = receiverPostorZipCode;
           this.receiverStateorCounty = receiverStateorCounty;
           this.receiverCountryCode = receiverCountryCode;
           this.receiverTelephone = receiverTelephone;
           this.receiverEmail = receiverEmail;
           this.receiverDocType = receiverDocType;
           this.receiverDOC = receiverDOC;
           this.receiverDOCDateOfIssue = receiverDOCDateOfIssue;
           this.receiverDOCDateOfExpiry = receiverDOCDateOfExpiry;
           this.receiverDOCCountryOfIssue = receiverDOCCountryOfIssue;
           this.receiverPlaceOfBirth = receiverPlaceOfBirth;
           this.testQuestion = testQuestion;
           this.testAnswer = testAnswer;
           this.reasonForPayment = reasonForPayment;
           this.sourceOfFund = sourceOfFund;
           this.bankAccount = bankAccount;
           this.bank = bank;
           this.localBankCode = localBankCode;
           this.bankBranch = bankBranch;
           this.bankAddress = bankAddress;
           this.bankCity = bankCity;
           this.IBAN = IBAN;
           this.bankState = bankState;
           this.bankCountry = bankCountry;
           this.CPFNumber = CPFNumber;
           this.bankAccountType = bankAccountType;
    }


    /**
     * Gets the credentials value for this SenderCreateREQ.
     * 
     * @return credentials
     */
    public org.tempuri.Authenticate getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this SenderCreateREQ.
     * 
     * @param credentials
     */
    public void setCredentials(org.tempuri.Authenticate credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the customerNo value for this SenderCreateREQ.
     * 
     * @return customerNo
     */
    public int getCustomerNo() {
        return customerNo;
    }


    /**
     * Sets the customerNo value for this SenderCreateREQ.
     * 
     * @param customerNo
     */
    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }


    /**
     * Gets the senderFirstName value for this SenderCreateREQ.
     * 
     * @return senderFirstName
     */
    public java.lang.String getSenderFirstName() {
        return senderFirstName;
    }


    /**
     * Sets the senderFirstName value for this SenderCreateREQ.
     * 
     * @param senderFirstName
     */
    public void setSenderFirstName(java.lang.String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }


    /**
     * Gets the senderLastName value for this SenderCreateREQ.
     * 
     * @return senderLastName
     */
    public java.lang.String getSenderLastName() {
        return senderLastName;
    }


    /**
     * Sets the senderLastName value for this SenderCreateREQ.
     * 
     * @param senderLastName
     */
    public void setSenderLastName(java.lang.String senderLastName) {
        this.senderLastName = senderLastName;
    }


    /**
     * Gets the senderDOB value for this SenderCreateREQ.
     * 
     * @return senderDOB
     */
    public java.util.Calendar getSenderDOB() {
        return senderDOB;
    }


    /**
     * Sets the senderDOB value for this SenderCreateREQ.
     * 
     * @param senderDOB
     */
    public void setSenderDOB(java.util.Calendar senderDOB) {
        this.senderDOB = senderDOB;
    }


    /**
     * Gets the senderGender value for this SenderCreateREQ.
     * 
     * @return senderGender
     */
    public java.lang.String getSenderGender() {
        return senderGender;
    }


    /**
     * Sets the senderGender value for this SenderCreateREQ.
     * 
     * @param senderGender
     */
    public void setSenderGender(java.lang.String senderGender) {
        this.senderGender = senderGender;
    }


    /**
     * Gets the senderAddress value for this SenderCreateREQ.
     * 
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this SenderCreateREQ.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderPostorZipCode value for this SenderCreateREQ.
     * 
     * @return senderPostorZipCode
     */
    public java.lang.String getSenderPostorZipCode() {
        return senderPostorZipCode;
    }


    /**
     * Sets the senderPostorZipCode value for this SenderCreateREQ.
     * 
     * @param senderPostorZipCode
     */
    public void setSenderPostorZipCode(java.lang.String senderPostorZipCode) {
        this.senderPostorZipCode = senderPostorZipCode;
    }


    /**
     * Gets the senderStateorCounty value for this SenderCreateREQ.
     * 
     * @return senderStateorCounty
     */
    public java.lang.String getSenderStateorCounty() {
        return senderStateorCounty;
    }


    /**
     * Sets the senderStateorCounty value for this SenderCreateREQ.
     * 
     * @param senderStateorCounty
     */
    public void setSenderStateorCounty(java.lang.String senderStateorCounty) {
        this.senderStateorCounty = senderStateorCounty;
    }


    /**
     * Gets the senderCountryCode value for this SenderCreateREQ.
     * 
     * @return senderCountryCode
     */
    public java.lang.String getSenderCountryCode() {
        return senderCountryCode;
    }


    /**
     * Sets the senderCountryCode value for this SenderCreateREQ.
     * 
     * @param senderCountryCode
     */
    public void setSenderCountryCode(java.lang.String senderCountryCode) {
        this.senderCountryCode = senderCountryCode;
    }


    /**
     * Gets the senderTelephone value for this SenderCreateREQ.
     * 
     * @return senderTelephone
     */
    public java.lang.String getSenderTelephone() {
        return senderTelephone;
    }


    /**
     * Sets the senderTelephone value for this SenderCreateREQ.
     * 
     * @param senderTelephone
     */
    public void setSenderTelephone(java.lang.String senderTelephone) {
        this.senderTelephone = senderTelephone;
    }


    /**
     * Gets the senderDocType value for this SenderCreateREQ.
     * 
     * @return senderDocType
     */
    public int getSenderDocType() {
        return senderDocType;
    }


    /**
     * Sets the senderDocType value for this SenderCreateREQ.
     * 
     * @param senderDocType
     */
    public void setSenderDocType(int senderDocType) {
        this.senderDocType = senderDocType;
    }


    /**
     * Gets the senderDOC value for this SenderCreateREQ.
     * 
     * @return senderDOC
     */
    public java.lang.String getSenderDOC() {
        return senderDOC;
    }


    /**
     * Sets the senderDOC value for this SenderCreateREQ.
     * 
     * @param senderDOC
     */
    public void setSenderDOC(java.lang.String senderDOC) {
        this.senderDOC = senderDOC;
    }


    /**
     * Gets the senderDOCDateOfIssue value for this SenderCreateREQ.
     * 
     * @return senderDOCDateOfIssue
     */
    public java.util.Calendar getSenderDOCDateOfIssue() {
        return senderDOCDateOfIssue;
    }


    /**
     * Sets the senderDOCDateOfIssue value for this SenderCreateREQ.
     * 
     * @param senderDOCDateOfIssue
     */
    public void setSenderDOCDateOfIssue(java.util.Calendar senderDOCDateOfIssue) {
        this.senderDOCDateOfIssue = senderDOCDateOfIssue;
    }


    /**
     * Gets the senderDOCDateOfExpiry value for this SenderCreateREQ.
     * 
     * @return senderDOCDateOfExpiry
     */
    public java.util.Calendar getSenderDOCDateOfExpiry() {
        return senderDOCDateOfExpiry;
    }


    /**
     * Sets the senderDOCDateOfExpiry value for this SenderCreateREQ.
     * 
     * @param senderDOCDateOfExpiry
     */
    public void setSenderDOCDateOfExpiry(java.util.Calendar senderDOCDateOfExpiry) {
        this.senderDOCDateOfExpiry = senderDOCDateOfExpiry;
    }


    /**
     * Gets the senderDOCCountryOfIssue value for this SenderCreateREQ.
     * 
     * @return senderDOCCountryOfIssue
     */
    public java.lang.String getSenderDOCCountryOfIssue() {
        return senderDOCCountryOfIssue;
    }


    /**
     * Sets the senderDOCCountryOfIssue value for this SenderCreateREQ.
     * 
     * @param senderDOCCountryOfIssue
     */
    public void setSenderDOCCountryOfIssue(java.lang.String senderDOCCountryOfIssue) {
        this.senderDOCCountryOfIssue = senderDOCCountryOfIssue;
    }


    /**
     * Gets the senderPlaceOfBirth value for this SenderCreateREQ.
     * 
     * @return senderPlaceOfBirth
     */
    public java.lang.String getSenderPlaceOfBirth() {
        return senderPlaceOfBirth;
    }


    /**
     * Sets the senderPlaceOfBirth value for this SenderCreateREQ.
     * 
     * @param senderPlaceOfBirth
     */
    public void setSenderPlaceOfBirth(java.lang.String senderPlaceOfBirth) {
        this.senderPlaceOfBirth = senderPlaceOfBirth;
    }


    /**
     * Gets the senderOccupation value for this SenderCreateREQ.
     * 
     * @return senderOccupation
     */
    public java.lang.String getSenderOccupation() {
        return senderOccupation;
    }


    /**
     * Sets the senderOccupation value for this SenderCreateREQ.
     * 
     * @param senderOccupation
     */
    public void setSenderOccupation(java.lang.String senderOccupation) {
        this.senderOccupation = senderOccupation;
    }


    /**
     * Gets the senderSocialSecurityNo value for this SenderCreateREQ.
     * 
     * @return senderSocialSecurityNo
     */
    public java.lang.String getSenderSocialSecurityNo() {
        return senderSocialSecurityNo;
    }


    /**
     * Sets the senderSocialSecurityNo value for this SenderCreateREQ.
     * 
     * @param senderSocialSecurityNo
     */
    public void setSenderSocialSecurityNo(java.lang.String senderSocialSecurityNo) {
        this.senderSocialSecurityNo = senderSocialSecurityNo;
    }


    /**
     * Gets the senderStateOfIssue value for this SenderCreateREQ.
     * 
     * @return senderStateOfIssue
     */
    public java.lang.String getSenderStateOfIssue() {
        return senderStateOfIssue;
    }


    /**
     * Sets the senderStateOfIssue value for this SenderCreateREQ.
     * 
     * @param senderStateOfIssue
     */
    public void setSenderStateOfIssue(java.lang.String senderStateOfIssue) {
        this.senderStateOfIssue = senderStateOfIssue;
    }


    /**
     * Gets the senderNationality value for this SenderCreateREQ.
     * 
     * @return senderNationality
     */
    public java.lang.String getSenderNationality() {
        return senderNationality;
    }


    /**
     * Sets the senderNationality value for this SenderCreateREQ.
     * 
     * @param senderNationality
     */
    public void setSenderNationality(java.lang.String senderNationality) {
        this.senderNationality = senderNationality;
    }


    /**
     * Gets the receiverNo value for this SenderCreateREQ.
     * 
     * @return receiverNo
     */
    public int getReceiverNo() {
        return receiverNo;
    }


    /**
     * Sets the receiverNo value for this SenderCreateREQ.
     * 
     * @param receiverNo
     */
    public void setReceiverNo(int receiverNo) {
        this.receiverNo = receiverNo;
    }


    /**
     * Gets the receiverFirstName value for this SenderCreateREQ.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this SenderCreateREQ.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverLastName value for this SenderCreateREQ.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this SenderCreateREQ.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverDOB value for this SenderCreateREQ.
     * 
     * @return receiverDOB
     */
    public java.util.Calendar getReceiverDOB() {
        return receiverDOB;
    }


    /**
     * Sets the receiverDOB value for this SenderCreateREQ.
     * 
     * @param receiverDOB
     */
    public void setReceiverDOB(java.util.Calendar receiverDOB) {
        this.receiverDOB = receiverDOB;
    }


    /**
     * Gets the receiverGender value for this SenderCreateREQ.
     * 
     * @return receiverGender
     */
    public java.lang.String getReceiverGender() {
        return receiverGender;
    }


    /**
     * Sets the receiverGender value for this SenderCreateREQ.
     * 
     * @param receiverGender
     */
    public void setReceiverGender(java.lang.String receiverGender) {
        this.receiverGender = receiverGender;
    }


    /**
     * Gets the receiverAddress value for this SenderCreateREQ.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this SenderCreateREQ.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the receiverPostorZipCode value for this SenderCreateREQ.
     * 
     * @return receiverPostorZipCode
     */
    public java.lang.String getReceiverPostorZipCode() {
        return receiverPostorZipCode;
    }


    /**
     * Sets the receiverPostorZipCode value for this SenderCreateREQ.
     * 
     * @param receiverPostorZipCode
     */
    public void setReceiverPostorZipCode(java.lang.String receiverPostorZipCode) {
        this.receiverPostorZipCode = receiverPostorZipCode;
    }


    /**
     * Gets the receiverStateorCounty value for this SenderCreateREQ.
     * 
     * @return receiverStateorCounty
     */
    public java.lang.String getReceiverStateorCounty() {
        return receiverStateorCounty;
    }


    /**
     * Sets the receiverStateorCounty value for this SenderCreateREQ.
     * 
     * @param receiverStateorCounty
     */
    public void setReceiverStateorCounty(java.lang.String receiverStateorCounty) {
        this.receiverStateorCounty = receiverStateorCounty;
    }


    /**
     * Gets the receiverCountryCode value for this SenderCreateREQ.
     * 
     * @return receiverCountryCode
     */
    public java.lang.String getReceiverCountryCode() {
        return receiverCountryCode;
    }


    /**
     * Sets the receiverCountryCode value for this SenderCreateREQ.
     * 
     * @param receiverCountryCode
     */
    public void setReceiverCountryCode(java.lang.String receiverCountryCode) {
        this.receiverCountryCode = receiverCountryCode;
    }


    /**
     * Gets the receiverTelephone value for this SenderCreateREQ.
     * 
     * @return receiverTelephone
     */
    public java.lang.String getReceiverTelephone() {
        return receiverTelephone;
    }


    /**
     * Sets the receiverTelephone value for this SenderCreateREQ.
     * 
     * @param receiverTelephone
     */
    public void setReceiverTelephone(java.lang.String receiverTelephone) {
        this.receiverTelephone = receiverTelephone;
    }


    /**
     * Gets the receiverEmail value for this SenderCreateREQ.
     * 
     * @return receiverEmail
     */
    public java.lang.String getReceiverEmail() {
        return receiverEmail;
    }


    /**
     * Sets the receiverEmail value for this SenderCreateREQ.
     * 
     * @param receiverEmail
     */
    public void setReceiverEmail(java.lang.String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }


    /**
     * Gets the receiverDocType value for this SenderCreateREQ.
     * 
     * @return receiverDocType
     */
    public int getReceiverDocType() {
        return receiverDocType;
    }


    /**
     * Sets the receiverDocType value for this SenderCreateREQ.
     * 
     * @param receiverDocType
     */
    public void setReceiverDocType(int receiverDocType) {
        this.receiverDocType = receiverDocType;
    }


    /**
     * Gets the receiverDOC value for this SenderCreateREQ.
     * 
     * @return receiverDOC
     */
    public java.lang.String getReceiverDOC() {
        return receiverDOC;
    }


    /**
     * Sets the receiverDOC value for this SenderCreateREQ.
     * 
     * @param receiverDOC
     */
    public void setReceiverDOC(java.lang.String receiverDOC) {
        this.receiverDOC = receiverDOC;
    }


    /**
     * Gets the receiverDOCDateOfIssue value for this SenderCreateREQ.
     * 
     * @return receiverDOCDateOfIssue
     */
    public java.util.Calendar getReceiverDOCDateOfIssue() {
        return receiverDOCDateOfIssue;
    }


    /**
     * Sets the receiverDOCDateOfIssue value for this SenderCreateREQ.
     * 
     * @param receiverDOCDateOfIssue
     */
    public void setReceiverDOCDateOfIssue(java.util.Calendar receiverDOCDateOfIssue) {
        this.receiverDOCDateOfIssue = receiverDOCDateOfIssue;
    }


    /**
     * Gets the receiverDOCDateOfExpiry value for this SenderCreateREQ.
     * 
     * @return receiverDOCDateOfExpiry
     */
    public java.util.Calendar getReceiverDOCDateOfExpiry() {
        return receiverDOCDateOfExpiry;
    }


    /**
     * Sets the receiverDOCDateOfExpiry value for this SenderCreateREQ.
     * 
     * @param receiverDOCDateOfExpiry
     */
    public void setReceiverDOCDateOfExpiry(java.util.Calendar receiverDOCDateOfExpiry) {
        this.receiverDOCDateOfExpiry = receiverDOCDateOfExpiry;
    }


    /**
     * Gets the receiverDOCCountryOfIssue value for this SenderCreateREQ.
     * 
     * @return receiverDOCCountryOfIssue
     */
    public java.lang.String getReceiverDOCCountryOfIssue() {
        return receiverDOCCountryOfIssue;
    }


    /**
     * Sets the receiverDOCCountryOfIssue value for this SenderCreateREQ.
     * 
     * @param receiverDOCCountryOfIssue
     */
    public void setReceiverDOCCountryOfIssue(java.lang.String receiverDOCCountryOfIssue) {
        this.receiverDOCCountryOfIssue = receiverDOCCountryOfIssue;
    }


    /**
     * Gets the receiverPlaceOfBirth value for this SenderCreateREQ.
     * 
     * @return receiverPlaceOfBirth
     */
    public java.lang.String getReceiverPlaceOfBirth() {
        return receiverPlaceOfBirth;
    }


    /**
     * Sets the receiverPlaceOfBirth value for this SenderCreateREQ.
     * 
     * @param receiverPlaceOfBirth
     */
    public void setReceiverPlaceOfBirth(java.lang.String receiverPlaceOfBirth) {
        this.receiverPlaceOfBirth = receiverPlaceOfBirth;
    }


    /**
     * Gets the testQuestion value for this SenderCreateREQ.
     * 
     * @return testQuestion
     */
    public java.lang.String getTestQuestion() {
        return testQuestion;
    }


    /**
     * Sets the testQuestion value for this SenderCreateREQ.
     * 
     * @param testQuestion
     */
    public void setTestQuestion(java.lang.String testQuestion) {
        this.testQuestion = testQuestion;
    }


    /**
     * Gets the testAnswer value for this SenderCreateREQ.
     * 
     * @return testAnswer
     */
    public java.lang.String getTestAnswer() {
        return testAnswer;
    }


    /**
     * Sets the testAnswer value for this SenderCreateREQ.
     * 
     * @param testAnswer
     */
    public void setTestAnswer(java.lang.String testAnswer) {
        this.testAnswer = testAnswer;
    }


    /**
     * Gets the reasonForPayment value for this SenderCreateREQ.
     * 
     * @return reasonForPayment
     */
    public java.lang.String getReasonForPayment() {
        return reasonForPayment;
    }


    /**
     * Sets the reasonForPayment value for this SenderCreateREQ.
     * 
     * @param reasonForPayment
     */
    public void setReasonForPayment(java.lang.String reasonForPayment) {
        this.reasonForPayment = reasonForPayment;
    }


    /**
     * Gets the sourceOfFund value for this SenderCreateREQ.
     * 
     * @return sourceOfFund
     */
    public java.lang.String getSourceOfFund() {
        return sourceOfFund;
    }


    /**
     * Sets the sourceOfFund value for this SenderCreateREQ.
     * 
     * @param sourceOfFund
     */
    public void setSourceOfFund(java.lang.String sourceOfFund) {
        this.sourceOfFund = sourceOfFund;
    }


    /**
     * Gets the bankAccount value for this SenderCreateREQ.
     * 
     * @return bankAccount
     */
    public java.lang.String getBankAccount() {
        return bankAccount;
    }


    /**
     * Sets the bankAccount value for this SenderCreateREQ.
     * 
     * @param bankAccount
     */
    public void setBankAccount(java.lang.String bankAccount) {
        this.bankAccount = bankAccount;
    }


    /**
     * Gets the bank value for this SenderCreateREQ.
     * 
     * @return bank
     */
    public java.lang.String getBank() {
        return bank;
    }


    /**
     * Sets the bank value for this SenderCreateREQ.
     * 
     * @param bank
     */
    public void setBank(java.lang.String bank) {
        this.bank = bank;
    }


    /**
     * Gets the localBankCode value for this SenderCreateREQ.
     * 
     * @return localBankCode
     */
    public java.lang.String getLocalBankCode() {
        return localBankCode;
    }


    /**
     * Sets the localBankCode value for this SenderCreateREQ.
     * 
     * @param localBankCode
     */
    public void setLocalBankCode(java.lang.String localBankCode) {
        this.localBankCode = localBankCode;
    }


    /**
     * Gets the bankBranch value for this SenderCreateREQ.
     * 
     * @return bankBranch
     */
    public java.lang.String getBankBranch() {
        return bankBranch;
    }


    /**
     * Sets the bankBranch value for this SenderCreateREQ.
     * 
     * @param bankBranch
     */
    public void setBankBranch(java.lang.String bankBranch) {
        this.bankBranch = bankBranch;
    }


    /**
     * Gets the bankAddress value for this SenderCreateREQ.
     * 
     * @return bankAddress
     */
    public java.lang.String getBankAddress() {
        return bankAddress;
    }


    /**
     * Sets the bankAddress value for this SenderCreateREQ.
     * 
     * @param bankAddress
     */
    public void setBankAddress(java.lang.String bankAddress) {
        this.bankAddress = bankAddress;
    }


    /**
     * Gets the bankCity value for this SenderCreateREQ.
     * 
     * @return bankCity
     */
    public java.lang.String getBankCity() {
        return bankCity;
    }


    /**
     * Sets the bankCity value for this SenderCreateREQ.
     * 
     * @param bankCity
     */
    public void setBankCity(java.lang.String bankCity) {
        this.bankCity = bankCity;
    }


    /**
     * Gets the IBAN value for this SenderCreateREQ.
     * 
     * @return IBAN
     */
    public java.lang.String getIBAN() {
        return IBAN;
    }


    /**
     * Sets the IBAN value for this SenderCreateREQ.
     * 
     * @param IBAN
     */
    public void setIBAN(java.lang.String IBAN) {
        this.IBAN = IBAN;
    }


    /**
     * Gets the bankState value for this SenderCreateREQ.
     * 
     * @return bankState
     */
    public java.lang.String getBankState() {
        return bankState;
    }


    /**
     * Sets the bankState value for this SenderCreateREQ.
     * 
     * @param bankState
     */
    public void setBankState(java.lang.String bankState) {
        this.bankState = bankState;
    }


    /**
     * Gets the bankCountry value for this SenderCreateREQ.
     * 
     * @return bankCountry
     */
    public java.lang.String getBankCountry() {
        return bankCountry;
    }


    /**
     * Sets the bankCountry value for this SenderCreateREQ.
     * 
     * @param bankCountry
     */
    public void setBankCountry(java.lang.String bankCountry) {
        this.bankCountry = bankCountry;
    }


    /**
     * Gets the CPFNumber value for this SenderCreateREQ.
     * 
     * @return CPFNumber
     */
    public java.lang.String getCPFNumber() {
        return CPFNumber;
    }


    /**
     * Sets the CPFNumber value for this SenderCreateREQ.
     * 
     * @param CPFNumber
     */
    public void setCPFNumber(java.lang.String CPFNumber) {
        this.CPFNumber = CPFNumber;
    }


    /**
     * Gets the bankAccountType value for this SenderCreateREQ.
     * 
     * @return bankAccountType
     */
    public java.lang.String getBankAccountType() {
        return bankAccountType;
    }


    /**
     * Sets the bankAccountType value for this SenderCreateREQ.
     * 
     * @param bankAccountType
     */
    public void setBankAccountType(java.lang.String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SenderCreateREQ)) return false;
        SenderCreateREQ other = (SenderCreateREQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            this.customerNo == other.getCustomerNo() &&
            ((this.senderFirstName==null && other.getSenderFirstName()==null) || 
             (this.senderFirstName!=null &&
              this.senderFirstName.equals(other.getSenderFirstName()))) &&
            ((this.senderLastName==null && other.getSenderLastName()==null) || 
             (this.senderLastName!=null &&
              this.senderLastName.equals(other.getSenderLastName()))) &&
            ((this.senderDOB==null && other.getSenderDOB()==null) || 
             (this.senderDOB!=null &&
              this.senderDOB.equals(other.getSenderDOB()))) &&
            ((this.senderGender==null && other.getSenderGender()==null) || 
             (this.senderGender!=null &&
              this.senderGender.equals(other.getSenderGender()))) &&
            ((this.senderAddress==null && other.getSenderAddress()==null) || 
             (this.senderAddress!=null &&
              this.senderAddress.equals(other.getSenderAddress()))) &&
            ((this.senderPostorZipCode==null && other.getSenderPostorZipCode()==null) || 
             (this.senderPostorZipCode!=null &&
              this.senderPostorZipCode.equals(other.getSenderPostorZipCode()))) &&
            ((this.senderStateorCounty==null && other.getSenderStateorCounty()==null) || 
             (this.senderStateorCounty!=null &&
              this.senderStateorCounty.equals(other.getSenderStateorCounty()))) &&
            ((this.senderCountryCode==null && other.getSenderCountryCode()==null) || 
             (this.senderCountryCode!=null &&
              this.senderCountryCode.equals(other.getSenderCountryCode()))) &&
            ((this.senderTelephone==null && other.getSenderTelephone()==null) || 
             (this.senderTelephone!=null &&
              this.senderTelephone.equals(other.getSenderTelephone()))) &&
            this.senderDocType == other.getSenderDocType() &&
            ((this.senderDOC==null && other.getSenderDOC()==null) || 
             (this.senderDOC!=null &&
              this.senderDOC.equals(other.getSenderDOC()))) &&
            ((this.senderDOCDateOfIssue==null && other.getSenderDOCDateOfIssue()==null) || 
             (this.senderDOCDateOfIssue!=null &&
              this.senderDOCDateOfIssue.equals(other.getSenderDOCDateOfIssue()))) &&
            ((this.senderDOCDateOfExpiry==null && other.getSenderDOCDateOfExpiry()==null) || 
             (this.senderDOCDateOfExpiry!=null &&
              this.senderDOCDateOfExpiry.equals(other.getSenderDOCDateOfExpiry()))) &&
            ((this.senderDOCCountryOfIssue==null && other.getSenderDOCCountryOfIssue()==null) || 
             (this.senderDOCCountryOfIssue!=null &&
              this.senderDOCCountryOfIssue.equals(other.getSenderDOCCountryOfIssue()))) &&
            ((this.senderPlaceOfBirth==null && other.getSenderPlaceOfBirth()==null) || 
             (this.senderPlaceOfBirth!=null &&
              this.senderPlaceOfBirth.equals(other.getSenderPlaceOfBirth()))) &&
            ((this.senderOccupation==null && other.getSenderOccupation()==null) || 
             (this.senderOccupation!=null &&
              this.senderOccupation.equals(other.getSenderOccupation()))) &&
            ((this.senderSocialSecurityNo==null && other.getSenderSocialSecurityNo()==null) || 
             (this.senderSocialSecurityNo!=null &&
              this.senderSocialSecurityNo.equals(other.getSenderSocialSecurityNo()))) &&
            ((this.senderStateOfIssue==null && other.getSenderStateOfIssue()==null) || 
             (this.senderStateOfIssue!=null &&
              this.senderStateOfIssue.equals(other.getSenderStateOfIssue()))) &&
            ((this.senderNationality==null && other.getSenderNationality()==null) || 
             (this.senderNationality!=null &&
              this.senderNationality.equals(other.getSenderNationality()))) &&
            this.receiverNo == other.getReceiverNo() &&
            ((this.receiverFirstName==null && other.getReceiverFirstName()==null) || 
             (this.receiverFirstName!=null &&
              this.receiverFirstName.equals(other.getReceiverFirstName()))) &&
            ((this.receiverLastName==null && other.getReceiverLastName()==null) || 
             (this.receiverLastName!=null &&
              this.receiverLastName.equals(other.getReceiverLastName()))) &&
            ((this.receiverDOB==null && other.getReceiverDOB()==null) || 
             (this.receiverDOB!=null &&
              this.receiverDOB.equals(other.getReceiverDOB()))) &&
            ((this.receiverGender==null && other.getReceiverGender()==null) || 
             (this.receiverGender!=null &&
              this.receiverGender.equals(other.getReceiverGender()))) &&
            ((this.receiverAddress==null && other.getReceiverAddress()==null) || 
             (this.receiverAddress!=null &&
              this.receiverAddress.equals(other.getReceiverAddress()))) &&
            ((this.receiverPostorZipCode==null && other.getReceiverPostorZipCode()==null) || 
             (this.receiverPostorZipCode!=null &&
              this.receiverPostorZipCode.equals(other.getReceiverPostorZipCode()))) &&
            ((this.receiverStateorCounty==null && other.getReceiverStateorCounty()==null) || 
             (this.receiverStateorCounty!=null &&
              this.receiverStateorCounty.equals(other.getReceiverStateorCounty()))) &&
            ((this.receiverCountryCode==null && other.getReceiverCountryCode()==null) || 
             (this.receiverCountryCode!=null &&
              this.receiverCountryCode.equals(other.getReceiverCountryCode()))) &&
            ((this.receiverTelephone==null && other.getReceiverTelephone()==null) || 
             (this.receiverTelephone!=null &&
              this.receiverTelephone.equals(other.getReceiverTelephone()))) &&
            ((this.receiverEmail==null && other.getReceiverEmail()==null) || 
             (this.receiverEmail!=null &&
              this.receiverEmail.equals(other.getReceiverEmail()))) &&
            this.receiverDocType == other.getReceiverDocType() &&
            ((this.receiverDOC==null && other.getReceiverDOC()==null) || 
             (this.receiverDOC!=null &&
              this.receiverDOC.equals(other.getReceiverDOC()))) &&
            ((this.receiverDOCDateOfIssue==null && other.getReceiverDOCDateOfIssue()==null) || 
             (this.receiverDOCDateOfIssue!=null &&
              this.receiverDOCDateOfIssue.equals(other.getReceiverDOCDateOfIssue()))) &&
            ((this.receiverDOCDateOfExpiry==null && other.getReceiverDOCDateOfExpiry()==null) || 
             (this.receiverDOCDateOfExpiry!=null &&
              this.receiverDOCDateOfExpiry.equals(other.getReceiverDOCDateOfExpiry()))) &&
            ((this.receiverDOCCountryOfIssue==null && other.getReceiverDOCCountryOfIssue()==null) || 
             (this.receiverDOCCountryOfIssue!=null &&
              this.receiverDOCCountryOfIssue.equals(other.getReceiverDOCCountryOfIssue()))) &&
            ((this.receiverPlaceOfBirth==null && other.getReceiverPlaceOfBirth()==null) || 
             (this.receiverPlaceOfBirth!=null &&
              this.receiverPlaceOfBirth.equals(other.getReceiverPlaceOfBirth()))) &&
            ((this.testQuestion==null && other.getTestQuestion()==null) || 
             (this.testQuestion!=null &&
              this.testQuestion.equals(other.getTestQuestion()))) &&
            ((this.testAnswer==null && other.getTestAnswer()==null) || 
             (this.testAnswer!=null &&
              this.testAnswer.equals(other.getTestAnswer()))) &&
            ((this.reasonForPayment==null && other.getReasonForPayment()==null) || 
             (this.reasonForPayment!=null &&
              this.reasonForPayment.equals(other.getReasonForPayment()))) &&
            ((this.sourceOfFund==null && other.getSourceOfFund()==null) || 
             (this.sourceOfFund!=null &&
              this.sourceOfFund.equals(other.getSourceOfFund()))) &&
            ((this.bankAccount==null && other.getBankAccount()==null) || 
             (this.bankAccount!=null &&
              this.bankAccount.equals(other.getBankAccount()))) &&
            ((this.bank==null && other.getBank()==null) || 
             (this.bank!=null &&
              this.bank.equals(other.getBank()))) &&
            ((this.localBankCode==null && other.getLocalBankCode()==null) || 
             (this.localBankCode!=null &&
              this.localBankCode.equals(other.getLocalBankCode()))) &&
            ((this.bankBranch==null && other.getBankBranch()==null) || 
             (this.bankBranch!=null &&
              this.bankBranch.equals(other.getBankBranch()))) &&
            ((this.bankAddress==null && other.getBankAddress()==null) || 
             (this.bankAddress!=null &&
              this.bankAddress.equals(other.getBankAddress()))) &&
            ((this.bankCity==null && other.getBankCity()==null) || 
             (this.bankCity!=null &&
              this.bankCity.equals(other.getBankCity()))) &&
            ((this.IBAN==null && other.getIBAN()==null) || 
             (this.IBAN!=null &&
              this.IBAN.equals(other.getIBAN()))) &&
            ((this.bankState==null && other.getBankState()==null) || 
             (this.bankState!=null &&
              this.bankState.equals(other.getBankState()))) &&
            ((this.bankCountry==null && other.getBankCountry()==null) || 
             (this.bankCountry!=null &&
              this.bankCountry.equals(other.getBankCountry()))) &&
            ((this.CPFNumber==null && other.getCPFNumber()==null) || 
             (this.CPFNumber!=null &&
              this.CPFNumber.equals(other.getCPFNumber()))) &&
            ((this.bankAccountType==null && other.getBankAccountType()==null) || 
             (this.bankAccountType!=null &&
              this.bankAccountType.equals(other.getBankAccountType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        _hashCode += getCustomerNo();
        if (getSenderFirstName() != null) {
            _hashCode += getSenderFirstName().hashCode();
        }
        if (getSenderLastName() != null) {
            _hashCode += getSenderLastName().hashCode();
        }
        if (getSenderDOB() != null) {
            _hashCode += getSenderDOB().hashCode();
        }
        if (getSenderGender() != null) {
            _hashCode += getSenderGender().hashCode();
        }
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getSenderPostorZipCode() != null) {
            _hashCode += getSenderPostorZipCode().hashCode();
        }
        if (getSenderStateorCounty() != null) {
            _hashCode += getSenderStateorCounty().hashCode();
        }
        if (getSenderCountryCode() != null) {
            _hashCode += getSenderCountryCode().hashCode();
        }
        if (getSenderTelephone() != null) {
            _hashCode += getSenderTelephone().hashCode();
        }
        _hashCode += getSenderDocType();
        if (getSenderDOC() != null) {
            _hashCode += getSenderDOC().hashCode();
        }
        if (getSenderDOCDateOfIssue() != null) {
            _hashCode += getSenderDOCDateOfIssue().hashCode();
        }
        if (getSenderDOCDateOfExpiry() != null) {
            _hashCode += getSenderDOCDateOfExpiry().hashCode();
        }
        if (getSenderDOCCountryOfIssue() != null) {
            _hashCode += getSenderDOCCountryOfIssue().hashCode();
        }
        if (getSenderPlaceOfBirth() != null) {
            _hashCode += getSenderPlaceOfBirth().hashCode();
        }
        if (getSenderOccupation() != null) {
            _hashCode += getSenderOccupation().hashCode();
        }
        if (getSenderSocialSecurityNo() != null) {
            _hashCode += getSenderSocialSecurityNo().hashCode();
        }
        if (getSenderStateOfIssue() != null) {
            _hashCode += getSenderStateOfIssue().hashCode();
        }
        if (getSenderNationality() != null) {
            _hashCode += getSenderNationality().hashCode();
        }
        _hashCode += getReceiverNo();
        if (getReceiverFirstName() != null) {
            _hashCode += getReceiverFirstName().hashCode();
        }
        if (getReceiverLastName() != null) {
            _hashCode += getReceiverLastName().hashCode();
        }
        if (getReceiverDOB() != null) {
            _hashCode += getReceiverDOB().hashCode();
        }
        if (getReceiverGender() != null) {
            _hashCode += getReceiverGender().hashCode();
        }
        if (getReceiverAddress() != null) {
            _hashCode += getReceiverAddress().hashCode();
        }
        if (getReceiverPostorZipCode() != null) {
            _hashCode += getReceiverPostorZipCode().hashCode();
        }
        if (getReceiverStateorCounty() != null) {
            _hashCode += getReceiverStateorCounty().hashCode();
        }
        if (getReceiverCountryCode() != null) {
            _hashCode += getReceiverCountryCode().hashCode();
        }
        if (getReceiverTelephone() != null) {
            _hashCode += getReceiverTelephone().hashCode();
        }
        if (getReceiverEmail() != null) {
            _hashCode += getReceiverEmail().hashCode();
        }
        _hashCode += getReceiverDocType();
        if (getReceiverDOC() != null) {
            _hashCode += getReceiverDOC().hashCode();
        }
        if (getReceiverDOCDateOfIssue() != null) {
            _hashCode += getReceiverDOCDateOfIssue().hashCode();
        }
        if (getReceiverDOCDateOfExpiry() != null) {
            _hashCode += getReceiverDOCDateOfExpiry().hashCode();
        }
        if (getReceiverDOCCountryOfIssue() != null) {
            _hashCode += getReceiverDOCCountryOfIssue().hashCode();
        }
        if (getReceiverPlaceOfBirth() != null) {
            _hashCode += getReceiverPlaceOfBirth().hashCode();
        }
        if (getTestQuestion() != null) {
            _hashCode += getTestQuestion().hashCode();
        }
        if (getTestAnswer() != null) {
            _hashCode += getTestAnswer().hashCode();
        }
        if (getReasonForPayment() != null) {
            _hashCode += getReasonForPayment().hashCode();
        }
        if (getSourceOfFund() != null) {
            _hashCode += getSourceOfFund().hashCode();
        }
        if (getBankAccount() != null) {
            _hashCode += getBankAccount().hashCode();
        }
        if (getBank() != null) {
            _hashCode += getBank().hashCode();
        }
        if (getLocalBankCode() != null) {
            _hashCode += getLocalBankCode().hashCode();
        }
        if (getBankBranch() != null) {
            _hashCode += getBankBranch().hashCode();
        }
        if (getBankAddress() != null) {
            _hashCode += getBankAddress().hashCode();
        }
        if (getBankCity() != null) {
            _hashCode += getBankCity().hashCode();
        }
        if (getIBAN() != null) {
            _hashCode += getIBAN().hashCode();
        }
        if (getBankState() != null) {
            _hashCode += getBankState().hashCode();
        }
        if (getBankCountry() != null) {
            _hashCode += getBankCountry().hashCode();
        }
        if (getCPFNumber() != null) {
            _hashCode += getCPFNumber().hashCode();
        }
        if (getBankAccountType() != null) {
            _hashCode += getBankAccountType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SenderCreateREQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SenderCreateREQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Authenticate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CustomerNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderGender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderGender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPostorZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderPostorZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderStateorCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderStateorCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDocType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderDocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderDOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDOCDateOfIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderDOCDateOfIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDOCDateOfExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderDOCDateOfExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDOCCountryOfIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderDOCCountryOfIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPlaceOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderPlaceOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderOccupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderOccupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderSocialSecurityNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderSocialSecurityNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderStateOfIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderStateOfIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderNationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverGender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverGender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPostorZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverPostorZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverStateorCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverStateorCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDocType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverDocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverDOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDOCDateOfIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverDOCDateOfIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDOCDateOfExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverDOCDateOfExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverDOCCountryOfIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverDOCCountryOfIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPlaceOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverPlaceOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TestQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TestAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonForPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReasonForPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceOfFund");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SourceOfFund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BankAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Bank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LocalBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BankBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BankAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BankCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IBAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IBAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BankState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BankCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPFNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CPFNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BankAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
