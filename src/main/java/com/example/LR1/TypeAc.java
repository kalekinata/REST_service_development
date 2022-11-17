package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ac_type",namespace = "http://namespaceTest.com/tranQueue")
@XmlType(propOrder = {"actp_name","actp_desc","a_p"})
public class TypeAc {
    String actp_name;
    String actp_desc;
    String a_p;

    public String getActp_name() {return actp_name;}

    @XmlElement(name = "actp_name",namespace = "http://namespaceTest.com/tranQueue")
    public void setActp_name(String actp_name) {
        this.actp_name = actp_name;
    }

    public String getActp_desc() {
        return actp_desc;
    }

    @XmlElement(name = "actp_desc",namespace = "http://namespaceTest.com/tranQueue")
    public void setActp_desc(String actp_desc) {
        this.actp_desc = actp_desc;
    }

    public String getA_p() {
        return a_p;
    }

    @XmlElement(name = "a_p",namespace = "http://namespaceTest.com/tranQueue")
    public void setA_p(String a_p) {
        this.a_p = a_p;
    }
}
