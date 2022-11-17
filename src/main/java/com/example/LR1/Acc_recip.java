package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "acc_recip",namespace = "http://namespaceTest.com/tranQueue")
public class Acc_recip {
    String accr;

    public String getAccr() {
        return accr;
    }

    @XmlAttribute(name = "accidr")
    public void setAccr(String accr) {
        this.accr = accr;
    }
}