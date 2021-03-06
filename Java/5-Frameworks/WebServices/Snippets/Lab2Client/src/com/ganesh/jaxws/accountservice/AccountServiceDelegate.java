package com.ganesh.jaxws.accountservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "AccountServiceDelegate", targetNamespace = "http://account.jaxws.ganesh.com/")
public interface AccountServiceDelegate {

	/**
	 * 
	 * @param arg0
	 * @return returns double
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getBal", targetNamespace = "http://account.jaxws.ganesh.com/", className = "com.ganesh.jaxws.accountservice.GetBal")
	@ResponseWrapper(localName = "getBalResponse", targetNamespace = "http://account.jaxws.ganesh.com/", className = "com.ganesh.jaxws.accountservice.GetBalResponse")
	public double getBal(@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "deposit", targetNamespace = "http://account.jaxws.ganesh.com/", className = "com.ganesh.jaxws.accountservice.Deposit")
	@ResponseWrapper(localName = "depositResponse", targetNamespace = "http://account.jaxws.ganesh.com/", className = "com.ganesh.jaxws.accountservice.DepositResponse")
	public void deposit(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") double arg1);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "withdrawa", targetNamespace = "http://account.jaxws.ganesh.com/", className = "com.ganesh.jaxws.accountservice.Withdrawa")
	@ResponseWrapper(localName = "withdrawaResponse", targetNamespace = "http://account.jaxws.ganesh.com/", className = "com.ganesh.jaxws.accountservice.WithdrawaResponse")
	public void withdrawa(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") double arg1);

}
