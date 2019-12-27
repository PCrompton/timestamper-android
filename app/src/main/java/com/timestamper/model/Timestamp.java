package com.timestamper.model;

public class Timestamp {
    int unix_timestamp;

    public Timestamp() {
        unix_timestamp = (int)System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Timestamp myObj = new Timestamp();
        System.out.println(myObj.unix_timestamp);
    }
}
