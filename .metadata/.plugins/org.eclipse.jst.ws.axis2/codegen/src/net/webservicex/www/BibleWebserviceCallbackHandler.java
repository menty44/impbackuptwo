
/**
 * BibleWebserviceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */

    package net.webservicex.www;

    /**
     *  BibleWebserviceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BibleWebserviceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BibleWebserviceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BibleWebserviceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getBookTitles method
            * override this method for handling normal response from getBookTitles operation
            */
           public void receiveResultgetBookTitles(
                    net.webservicex.www.BibleWebserviceStub.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBookTitles operation
           */
            public void receiveErrorgetBookTitles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBibleWordsbyKeyWord method
            * override this method for handling normal response from getBibleWordsbyKeyWord operation
            */
           public void receiveResultgetBibleWordsbyKeyWord(
                    net.webservicex.www.BibleWebserviceStub.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBibleWordsbyKeyWord operation
           */
            public void receiveErrorgetBibleWordsbyKeyWord(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBibleWordsByBookTitleAndChapter method
            * override this method for handling normal response from getBibleWordsByBookTitleAndChapter operation
            */
           public void receiveResultgetBibleWordsByBookTitleAndChapter(
                    net.webservicex.www.BibleWebserviceStub.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBibleWordsByBookTitleAndChapter operation
           */
            public void receiveErrorgetBibleWordsByBookTitleAndChapter(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBibleWordsByChapterAndVerse method
            * override this method for handling normal response from getBibleWordsByChapterAndVerse operation
            */
           public void receiveResultgetBibleWordsByChapterAndVerse(
                    net.webservicex.www.BibleWebserviceStub.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBibleWordsByChapterAndVerse operation
           */
            public void receiveErrorgetBibleWordsByChapterAndVerse(java.lang.Exception e) {
            }
                


    }
    