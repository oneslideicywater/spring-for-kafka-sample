package com.example.kafkalistener.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    private String value;
    private boolean flag;

    public Item() {
    }

    public Item (String value,  boolean flag) {
        this.value = value;
        this.flag = flag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value='" + value + '\'' +
                ", flag=" + flag +
                '}';
    }
}
