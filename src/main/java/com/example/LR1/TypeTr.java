package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "tran_type", namespace = "http://namespaceTest.com/tranQueue")
@XmlType(propOrder = {"trtp_name","trtp_desc"})
public class TypeTr {
    String trtp_name;
    String trtp_desc;

    public String getTrtp_name() {
        return trtp_name;
    }

    @XmlElement(name = "trtp_name",namespace = "http://namespaceTest.com/tranQueue")
    public void setTrtp_name(String trtp_name) {
        this.trtp_name = trtp_name;
    }

    public String getTrtp_desc() {
        return trtp_desc;
    }

    @XmlElement(name = "trtp_desc",namespace = "http://namespaceTest.com/tranQueue")
    public void setTrtp_desc(String trtp_desc) {
        this.trtp_desc = trtp_desc;
    }
}
