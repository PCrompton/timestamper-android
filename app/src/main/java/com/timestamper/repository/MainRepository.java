package com.timestamper.repository;

import com.timestamper.Web.TimestamperAPIController;
import com.timestamper.model.Timestamp;

public class MainRepository {

    private static TimestamperAPIController timestamperAPIController = new TimestamperAPIController();

    public void sendTimestamp(Timestamp timestamp) {
        timestamperAPIController.start();
        timestamperAPIController.createTimestamp(timestamp);
        System.out.println(timestamp);
    }
}
