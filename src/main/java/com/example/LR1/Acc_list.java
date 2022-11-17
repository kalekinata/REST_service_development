package com.example.LR1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "acc_list",namespace = "http://namespaceTest.com/tranQueue")
public class Acc_list {
    List<Account> account;

    public List<Account> getAccount() {
        return account;
    }

    @XmlElement(name = "account",namespace = "http://namespaceTest.com/tranQueue")
    public void setAccount(List<Account> account) {
        this.account = account;
    }
}
