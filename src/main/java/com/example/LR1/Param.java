package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "param",namespace = "http://namespaceTest.com/tranQueue")
public class Param {
    String p_name;
    String p_value;

    public String getP_name() {
        return p_name;
    }

    @XmlElement(name = "p_name",namespace = "http://namespaceTest.com/tranQueue")
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_value() {
        return p_value;
    }

    @XmlElement(name = "p_value",namespace = "http://namespaceTest.com/tranQueue")
    public void setP_value(String p_value) {
        this.p_value = p_value;
    }
}
