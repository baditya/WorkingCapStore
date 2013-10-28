
package com.cg.bankservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankWebService", targetNamespace = "http://webservice.cg.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankWebService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "refund", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.Refund")
    @ResponseWrapper(localName = "refundResponse", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.RefundResponse")
    @Action(input = "http://webservice.cg.com/BankWebService/refundRequest", output = "http://webservice.cg.com/BankWebService/refundResponse")
    public boolean refund(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makePayment", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.MakePayment")
    @ResponseWrapper(localName = "makePaymentResponse", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.MakePaymentResponse")
    @Action(input = "http://webservice.cg.com/BankWebService/makePaymentRequest", output = "http://webservice.cg.com/BankWebService/makePaymentResponse")
    public List<Integer> makePayment(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Integer> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "exchangeKey", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.ExchangeKey")
    @ResponseWrapper(localName = "exchangeKeyResponse", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.ExchangeKeyResponse")
    @Action(input = "http://webservice.cg.com/BankWebService/exchangeKeyRequest", output = "http://webservice.cg.com/BankWebService/exchangeKeyResponse")
    public List<Integer> exchangeKey(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Integer> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "check", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.Check")
    @ResponseWrapper(localName = "checkResponse", targetNamespace = "http://webservice.cg.com/", className = "com.cg.bankservice.CheckResponse")
    @Action(input = "http://webservice.cg.com/BankWebService/checkRequest", output = "http://webservice.cg.com/BankWebService/checkResponse")
    public List<Integer> check(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Integer> arg0);

}