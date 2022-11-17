package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "client", namespace = "http://namespaceTest.com/tranQueue")
@XmlType(propOrder = {"clid", "cl_dadd", "cl_name", "client_type", "client_param", "client_requiset", "document",
        "cl_status", "acc_list"})
public class Client {
    String clid;
    Date cl_dadd;
    String cl_name;
    TypeCl client_type;
    Cl_param client_param;
    Cl_requiset client_requiset;
    Document document;
    Cl_status cl_status;
    Acc_list acc_list;

    public String getClid() {
        return clid;
    }

    @XmlAttribute(name = "clid")
    public void setClid(String clid) {
        this.clid = clid;
    }

    public Date getCl_dadd() {
        return cl_dadd;
    }

    @XmlElement(name = "cl_dadd", namespace = "http://namespaceTest.com/tranQueue")
    public void setCl_dadd(Date cl_dadd) {
        this.cl_dadd = cl_dadd;
    }

    public String getCl_name() {
        return cl_name;
    }

    @XmlElement(name = "cl_name", namespace = "http://namespaceTest.com/tranQueue")
    public void setCl_name(String cl_name) {
        this.cl_name = cl_name;
    }

    public TypeCl getClient_type() {
        return client_type;
    }

    @XmlElement(name = "client_type", namespace = "http://namespaceTest.com/tranQueue")
    public void setClient_type(TypeCl client_type) {
        this.client_type = client_type;
    }

    public Cl_param getClient_param() {
        return client_param;
    }

    @XmlElement(name = "client_param", namespace = "http://namespaceTest.com/tranQueue")
    public void setClient_param(Cl_param client_param) {
        this.client_param = client_param;
    }

    public Cl_requiset getClient_requiset() {
        return client_requiset;
    }

    @XmlElement(name = "client_requiset", namespace = "http://namespaceTest.com/tranQueue")
    public void setClient_requiset(Cl_requiset client_requiset) {
        this.client_requiset = client_requiset;
    }

    public Document getDocument() {
        return document;
    }

    @XmlElement(name = "document", namespace = "http://namespaceTest.com/tranQueue")
    public void setDocument(Document document) {
        this.document = document;
    }

    public Cl_status getCl_status() {
        return cl_status;
    }

    @XmlElement(name = "cl_status", namespace = "http://namespaceTest.com/tranQueue")
    public void setCl_status(Cl_status cl_status) {
        this.cl_status = cl_status;
    }

    public Acc_list getAcc_list() {
        return acc_list;
    }

    @XmlElement(name = "acc_list", namespace = "http://namespaceTest.com/tranQueue")
    public void setAcc_list(Acc_list acc_list) {
        this.acc_list = acc_list;
    }
}
