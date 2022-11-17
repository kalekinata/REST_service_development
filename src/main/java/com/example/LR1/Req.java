package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "req",namespace = "http://namespaceTest.com/tranQueue")
public class Req {
    String req_name;
    String req_value;

    public String getReq_name() {
        return req_name;
    }

    @XmlElement(name = "req_name",namespace = "http://namespaceTest.com/tranQueue")
    public void setReq_name(String req_name) {
        this.req_name = req_name;
    }

    public String getReq_value() {
        return req_value;
    }

    @XmlElement(name = "req_value", namespace = "http://namespaceTest.com/tranQueue")
    public void setReq_value(String req_value) {
        this.req_value = req_value;
    }
}
