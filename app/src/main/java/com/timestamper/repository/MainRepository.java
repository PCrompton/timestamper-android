package com.timestamper.repository;

import com.timestamper.Web.TimestamperService;
import com.timestamper.Web.TimestamperWebservice;
import com.timestamper.model.Timestamp;

public class MainRepository {
    TimestamperService timestamperService = new TimestamperService();

    public void sendTimestamp(Timestamp timestamp) {
        System.out.println(timestamp);
    }
}
