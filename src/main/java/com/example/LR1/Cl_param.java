package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "client_param",namespace = "http://namespaceTest.com/tranQueue")
public class Cl_param {
    List<Param> param;

    public List<Param> getParam() {
        return param;
    }

    @XmlElement(name = "param", namespace = "http://namespaceTest.com/tranQueue")
    public void setParam(List<Param> param) {
        this.param = param;
    }
}
