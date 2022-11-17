package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "tranQueue", namespace = "http://namespaceTest.com/tranQueue")
@XmlType(propOrder = {"client_list", "transactions"})
public class TranQueue {
    Client_list client_list;
    Transactions transactions;

    public Client_list getClient_list() {
        return client_list;
    }
    public Transactions getTransactions() {
        return transactions;
    }

    @XmlElement(name = "client_list", namespace = "http://namespaceTest.com/tranQueue")
    public void setClient_list(Client_list client_list) {
        this.client_list = client_list;
    }

    @XmlElement(name = "transactions",namespace = "http://namespaceTest.com/tranQueue")
    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

}
