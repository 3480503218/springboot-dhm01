package com.dhm.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "aaa")
public class Author {
    private String name;
    private int ages;
//,locations = {"classpath:congig/a.properties"}

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public Author(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }
}
