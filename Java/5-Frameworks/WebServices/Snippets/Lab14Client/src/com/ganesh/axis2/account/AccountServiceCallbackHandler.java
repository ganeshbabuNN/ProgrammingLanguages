
/**
 * AccountServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:24:07 CET)
 */

    package com.ganesh.axis2.account;

    /**
     *  AccountServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AccountServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AccountServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AccountServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for withdraw method
            * override this method for handling normal response from withdraw operation
            */
           public void receiveResultwithdraw(
                    com.ganesh.axis2.account.AccountServiceStub.UserMessage result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from withdraw operation
           */
            public void receiveErrorwithdraw(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deposit method
            * override this method for handling normal response from deposit operation
            */
           public void receiveResultdeposit(
                    com.ganesh.axis2.account.AccountServiceStub.UserMessage result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deposit operation
           */
            public void receiveErrordeposit(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBal method
            * override this method for handling normal response from getBal operation
            */
           public void receiveResultgetBal(
                    com.ganesh.axis2.account.AccountServiceStub.Account result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBal operation
           */
            public void receiveErrorgetBal(java.lang.Exception e) {
            }
                


    }
    