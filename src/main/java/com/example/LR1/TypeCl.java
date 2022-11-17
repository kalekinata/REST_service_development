package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "client_type", namespace = "http://namespaceTest.com/tranQueue")
public class TypeCl {
    String cltp_name;
    String cltp_desc;

    public String getCltp_name() {
        return cltp_name;
    }

    @XmlElement(name = "cltp_name", namespace = "http://namespaceTest.com/tranQueue")
    public void setCltp_name(String cltp_name) {
        this.cltp_name = cltp_name;
    }

    public String getCltp_desc() {
        return cltp_desc;
    }

    @XmlElement(name = "cltp_desc", namespace = "http://namespaceTest.com/tranQueue")
    public void setCltp_desc(String cltp_desc) {
        this.cltp_desc = cltp_desc;
    }
}
