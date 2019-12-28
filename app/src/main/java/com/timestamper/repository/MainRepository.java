package com.timestamper.repository;

import android.content.Context;

import com.timestamper.Web.TimestamperAPIController;
import com.timestamper.model.Timestamp;

public class MainRepository {

    private static TimestamperAPIController timestamperAPIController = new TimestamperAPIController();

    public void sendTimestamp(Timestamp timestamp, Context context) {
        timestamperAPIController.start(context);
        timestamperAPIController.createTimestamp(timestamp);
        System.out.println(timestamp);
    }
}
