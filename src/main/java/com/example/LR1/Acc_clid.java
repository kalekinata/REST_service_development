package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "acc_clid", namespace = "http://namespaceTest.com/tranQueue")
public class Acc_clid {
    String clid;

    public String getClid() {
        return clid;
    }

    @XmlAttribute(name = "clid")
    public void setClid(String clid) {
        this.clid = clid;
    }
}
