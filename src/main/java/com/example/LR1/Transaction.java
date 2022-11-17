package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "transaction",namespace = "http://namespaceTest.com/tranQueue")

@XmlType(propOrder = {"tran_id","tran_dadd","tran_type","acc_sender","acc_recip","model","status"})
public class Transaction{
    String tran_id;
    Date tran_dadd;
    TypeTr tran_type;
    Acc_sender acc_sender;
    Acc_recip acc_recip;
    Model model;
    String status;

    public String getTran_id() {
        return tran_id;
    }

    @XmlAttribute(name = "tranid")
    public void setTran_id(String tran_id) {
        this.tran_id = tran_id;
    }

    public Date getTran_dadd() {
        return tran_dadd;
    }

    @XmlElement(name = "tran_dadd", namespace = "http://namespaceTest.com/tranQueue")
    public void setTran_dadd(Date tran_dadd) {
        this.tran_dadd = tran_dadd;
    }

    public TypeTr getTran_type() {
        return tran_type;
    }

    @XmlElement(name = "tran_type", namespace = "http://namespaceTest.com/tranQueue")
    public void setTran_type(TypeTr tran_type) {
        this.tran_type = tran_type;
    }

    public Acc_sender getAcc_sender() {
        return acc_sender;
    }

    @XmlElement(name = "acc_sender", namespace = "http://namespaceTest.com/tranQueue")
    public void setAcc_sender(Acc_sender acc_sender) {
        this.acc_sender = acc_sender;
    }

    public Acc_recip getAcc_recip() {
        return acc_recip;
    }

    @XmlElement(name = "acc_recip", namespace = "http://namespaceTest.com/tranQueue")
    public void setAcc_recip(Acc_recip acc_recip) {
        this.acc_recip = acc_recip;
    }

    public Model getModel() {
        return model;
    }

    @XmlElement(name = "model", namespace = "http://namespaceTest.com/tranQueue")
    public void setModel(Model model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    @XmlElement(name = "status", namespace = "http://namespaceTest.com/tranQueue")
    public void setStatus(String status) {
        this.status = status;
    }
}
