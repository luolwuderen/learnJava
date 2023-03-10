package com.example.wsdlproject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2022-12-27T14:06:32.830+08:00
 * Generated source version: 4.0.0
 *
 */
@WebService(targetNamespace = "http://service.web.custom.baiwang.com", name = "CEBJxWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface CEBJxWebService {

    @WebMethod
    @RequestWrapper(localName = "findInvoice", targetNamespace = "http://service.web.custom.baiwang.com", className = "com.example.wsdlproject.FindInvoice")
    @ResponseWrapper(localName = "findInvoiceResponse", targetNamespace = "http://service.web.custom.baiwang.com", className = "com.example.wsdlproject.FindInvoiceResponse")
    @WebResult(name = "invoiceResponse", targetNamespace = "")
    public java.lang.String findInvoice(

        @WebParam(name = "invoiceRequest", targetNamespace = "")
        java.lang.String invoiceRequest
    );
}
