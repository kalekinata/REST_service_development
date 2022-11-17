package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "client_requiset",namespace = "http://namespaceTest.com/tranQueue")
public class Cl_requiset {
    List<Req> req;

    public List<Req> getReq() {
        return req;
    }

    @XmlElement(name = "req",namespace = "http://namespaceTest.com/tranQueue")
    public void setReq(List<Req> req) {
        this.req = req;
    }
}
