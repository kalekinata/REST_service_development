package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "acc_sender",namespace = "http://namespaceTest.com/tranQueue")
public class Acc_sender {
    String accs;

    public String getAccs() {
        return accs;
    }

    @XmlAttribute(name = "accids")
    public void setAccs(String accs) {
        this.accs = accs;
    }
}

