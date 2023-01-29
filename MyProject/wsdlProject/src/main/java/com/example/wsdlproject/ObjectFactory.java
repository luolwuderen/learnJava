
package com.example.wsdlproject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.wsdlproject package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindInvoice_QNAME = new QName("http://service.web.custom.baiwang.com", "findInvoice");
    private final static QName _FindInvoiceResponse_QNAME = new QName("http://service.web.custom.baiwang.com", "findInvoiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.wsdlproject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindInvoice }
     * 
     */
    public FindInvoice createFindInvoice() {
        return new FindInvoice();
    }

    /**
     * Create an instance of {@link FindInvoiceResponse }
     * 
     */
    public FindInvoiceResponse createFindInvoiceResponse() {
        return new FindInvoiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindInvoice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindInvoice }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.web.custom.baiwang.com", name = "findInvoice")
    public JAXBElement<FindInvoice> createFindInvoice(FindInvoice value) {
        return new JAXBElement<FindInvoice>(_FindInvoice_QNAME, FindInvoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindInvoiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindInvoiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.web.custom.baiwang.com", name = "findInvoiceResponse")
    public JAXBElement<FindInvoiceResponse> createFindInvoiceResponse(FindInvoiceResponse value) {
        return new JAXBElement<FindInvoiceResponse>(_FindInvoiceResponse_QNAME, FindInvoiceResponse.class, null, value);
    }

}
