package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "transactions",namespace = "http://namespaceTest.com/tranQueue")
public class Transactions {
    List<Transaction> transaction;

    public List<Transaction> getTransaction() {
        return transaction;
    }

    @XmlElement(name = "transaction",namespace = "http://namespaceTest.com/tranQueue")
    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}