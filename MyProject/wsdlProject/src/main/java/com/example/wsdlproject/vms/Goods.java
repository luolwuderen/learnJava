package com.example.wsdlproject.vms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goods", propOrder = {
        "line", "spmc", "ssflbm", "standard", "unit", "price", "taxamount", "amount", "jshj"
})
public class Goods implements Serializable {
    private static final long serialVersionUID = -2743669002927256636L;

    @XmlElement(name = "line")
    private Integer line;

    @XmlElement(name = "spmc")
    private String spmc;

    @XmlElement(name = "ssflbm")
    private String ssflbm;

    @XmlElement(name = "standard")
    private String standard;

    @XmlElement(name = "unit")
    private String unit;

    @XmlElement(name = "price")
    private BigDecimal price;

    @XmlElement(name = "taxamount")
    private BigDecimal taxamount;

    @XmlElement(name = "amount")
    private BigDecimal amount;

    @XmlElement(name = "jshj")
    private BigDecimal jshj;


    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getSpmc() {
        return spmc;
    }

    public void setSpmc(String spmc) {
        this.spmc = spmc;
    }

    public String getSsflbm() {
        return ssflbm;
    }

    public void setSsflbm(String ssflbm) {
        this.ssflbm = ssflbm;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getJshj() {
        return jshj;
    }

    public void setJshj(BigDecimal jshj) {
        this.jshj = jshj;
    }
}
