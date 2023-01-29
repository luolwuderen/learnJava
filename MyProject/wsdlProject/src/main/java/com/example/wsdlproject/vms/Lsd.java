package com.example.wsdlproject.vms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lsd", propOrder = {
        "lsdbh", "accountdate"
})
public class Lsd implements Serializable {
    private static final long serialVersionUID = -5163679127345295215L;

    @XmlElement(name = "lsdbh")
    private String lsdbh;

    @XmlElement(name = "accountdate")
    private String accountdate;

    public String getLsdbh() {
        return lsdbh;
    }

    public void setLsdbh(String lsdbh) {
        this.lsdbh = lsdbh;
    }

    public String getAccountdate() {
        return accountdate;
    }

    public void setAccountdate(String accountdate) {
        this.accountdate = accountdate;
    }
}
