package com.example.LR1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "document", namespace = "http://namespaceTest.com/tranQueue")
public class Document {
    String image;

    public String getImage() {
        return image;
    }

    @XmlAttribute(name = "image")
    public void setImage(String image) {
        this.image = image;
    }
}
