package com.example.wsdlproject.vms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base", propOrder = {
        "requestid"
})
public class Base implements Serializable {


    private static final long serialVersionUID = 3509997098400063285L;

    @XmlElement(name = "requestid")
    private String requestid;

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }
}
