package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cl_status", namespace = "http://namespaceTest.com/tranQueue")
public class Cl_status {
    String param;

    public String getParam() {
        return param;
    }

    @XmlAttribute(name = "param")
    public void setParam(String param) {
        this.param = param;
    }
}
