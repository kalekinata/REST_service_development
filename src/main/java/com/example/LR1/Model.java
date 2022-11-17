package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "model",namespace = "http://namespaceTest.com/tranQueue")
@XmlType(propOrder = {"tr_clid","sum"})
public class Model {
    String tr_clid;
    Float sum;

    public String getTr_clid() {
        return tr_clid;
    }

    @XmlElement(name = "clid",namespace = "http://namespaceTest.com/tranQueue")
    public void setTr_clid(String tr_clid) {
        this.tr_clid = tr_clid;
    }

    public Float getSum() {
        return sum;
    }

    @XmlElement(name = "sum",namespace = "http://namespaceTest.com/tranQueue")
    public void setSum(Float sum) {
        this.sum = sum;
    }
}
