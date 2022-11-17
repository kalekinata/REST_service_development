package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "client_list",namespace = "http://namespaceTest.com/tranQueue")
public class Client_list {
    List<Client> client;

    public List<Client> getClient() {
        return client;
    }

    @XmlElement(name = "client", namespace = "http://namespaceTest.com/tranQueue")
    public void setClient(List<Client> client) {
        this.client = client;
    }
}
