package com.example.wsdlproject.vms;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
        "base", "invoicelist"
})
@XmlRootElement(name = "request")
public class InvoiceDrawupServiceRequest implements Serializable {

    private static final long serialVersionUID = 2091284192532039403L;
    @XmlElement(name = "base", required = true)
    private Base base;

    @XmlElement(name = "invoicelist", required = true)
    private InvoiceDrawupServiceRequest.Invoicelist invoicelist;

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public InvoiceDrawupServiceRequest.Invoicelist getInvoicelist() {
        return invoicelist;
    }

    public void setInvoicelist(InvoiceDrawupServiceRequest.Invoicelist invoicelist) {
        this.invoicelist = invoicelist;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"invoice"})
    public static class Invoicelist implements Serializable {


        private static final long serialVersionUID = 2904107988486966069L;
        @XmlElement(name = "invoicelist")
        protected List<Invoice> invoice;

        public List<Invoice> getInvoicelist() {
            if (invoice == null)
            {
                invoice = new ArrayList<Invoice>();
            }
            return invoice;
        }

        public void setInvoicelist(List<Invoice> invoicelist) {
            this.invoice = invoicelist;
        }
    }
}
