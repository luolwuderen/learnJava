package com.example.wsdlproject.vms;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice", propOrder = {
        "kpqqlsh", "sfjyls", "lsdlist", "fplx", "salecompanyid", "taxcode", "taxname", "addtel", "bankaccount", "cashier", "checker", "memo", "goodslist"
})
public class Invoice implements Serializable {
    private static final long serialVersionUID = -3203437014855654629L;

    @XmlElement(name = "kpqqlsh")
    private String kpqqlsh;

    @XmlElement(name = "sfjyls")
    private String sfjyls;

    @XmlElement(name = "lsdlist")
    private List<Lsd> lsdlist;

    @XmlElement(name = "fplx")
    private String fplx;

    @XmlElement(name = "salecompanyid")
    private String salecompanyid;

    @XmlElement(name = "taxcode")
    private String taxcode;

    @XmlElement(name = "taxname")
    private String taxname;

    @XmlElement(name = "addtel")
    private String addtel;

    @XmlElement(name = "bankaccount")
    private String bankaccount;

    @XmlElement(name = "cashier")
    private String cashier;

    @XmlElement(name = "checker")
    private String checker;

    @XmlElement(name = "memo")
    private String memo;

    @XmlElement(name = "goodslist")
    private List<Goods> goodslist;

    public String getKpqqlsh() {
        return kpqqlsh;
    }

    public void setKpqqlsh(String kpqqlsh) {
        this.kpqqlsh = kpqqlsh;
    }

    public String getSfjyls() {
        return sfjyls;
    }

    public void setSfjyls(String sfjyls) {
        this.sfjyls = sfjyls;
    }

    public List<Lsd> getLsdlist() {
        return lsdlist;
    }

    public void setLsdlist(List<Lsd> lsdlist) {
        this.lsdlist = lsdlist;
    }

    public String getFplx() {
        return fplx;
    }

    public void setFplx(String fplx) {
        this.fplx = fplx;
    }

    public String getSalecompanyid() {
        return salecompanyid;
    }

    public void setSalecompanyid(String salecompanyid) {
        this.salecompanyid = salecompanyid;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public String getTaxname() {
        return taxname;
    }

    public void setTaxname(String taxname) {
        this.taxname = taxname;
    }

    public String getAddtel() {
        return addtel;
    }

    public void setAddtel(String addtel) {
        this.addtel = addtel;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<Goods> getGoodslist() {
        return goodslist;
    }

    public void setGoodslist(List<Goods> goodslist) {
        this.goodslist = goodslist;
    }
}
