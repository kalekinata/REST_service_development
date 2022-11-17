package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "account",namespace = "http://namespaceTest.com/tranQueue")
@XmlType(propOrder = {"accid","acc_dadd","ac_type","acc_clid","balance","balance_free","hold"})
public class Account {
    String accid;
    Date acc_dadd;
    TypeAc ac_type;
    Acc_clid acc_clid;
    Float balance;
    Float balance_free;
    Float hold;

    public String getAccid() {
        return accid;
    }

    @XmlAttribute(name = "accid")
    public void setAccid(String accid) {
        this.accid = accid;
    }

    public Date getAcc_dadd() {
        return acc_dadd;
    }

    @XmlElement(name = "acc_dadd", namespace = "http://namespaceTest.com/tranQueue")
    public void setAcc_dadd(Date acc_dadd) {
        this.acc_dadd = acc_dadd;
    }

    public TypeAc getAc_type() {
        return ac_type;
    }

    @XmlElement(name = "ac_type", namespace = "http://namespaceTest.com/tranQueue")
    public void setAc_type(TypeAc ac_type) {
        this.ac_type = ac_type;
    }

    public Acc_clid getAcc_clid() {
        return acc_clid;
    }

    @XmlElement(name = "acc_clid", namespace = "http://namespaceTest.com/tranQueue")
    public void setAcc_clid(Acc_clid acc_clid) {
        this.acc_clid = acc_clid;
    }

    public Float getBalance() {
        return balance;
    }

    @XmlElement(name = "balance", namespace = "http://namespaceTest.com/tranQueue")
    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Float getBalance_free() {
        return balance_free;
    }

    @XmlElement(name = "balance_free", namespace = "http://namespaceTest.com/tranQueue")
    public void setBalance_free(Float balance_free) {
        this.balance_free = balance_free;
    }

    public Float getHold() {
        return hold;
    }

    @XmlElement(name = "hold", namespace = "http://namespaceTest.com/tranQueue")
    public void setHold(Float hold) {
        this.hold = hold;
    }
}
