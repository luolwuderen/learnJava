package com.example.wsdlproject.vms;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestVMS {

    public static void main(String[] args) throws Exception {

        Base base = new Base();
        base.setRequestid("123456789");
        InvoiceDrawupServiceRequest request = new InvoiceDrawupServiceRequest();
        request.setBase(base);

        Invoice invoice = new Invoice();
        invoice.setAddtel("1");


        InvoiceDrawupServiceRequest.Invoicelist invoicelist = new InvoiceDrawupServiceRequest.Invoicelist();
        invoicelist.getInvoicelist().add(invoice);



        JAXBContext context = JAXBContext.newInstance(InvoiceDrawupServiceRequest.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");

        StringWriter s = new StringWriter();
        marshaller.marshal(request, s);
        System.out.println(s.toString());
    }
}
