package com.timestamper.model;

public class Timestamp {
    Long unix_timestamp;

    public Timestamp() {
        unix_timestamp = System.currentTimeMillis()/1000;
    }
}