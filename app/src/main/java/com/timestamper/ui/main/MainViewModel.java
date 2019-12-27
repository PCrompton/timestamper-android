package com.timestamper.ui.main;

import android.util.Log;

import java.sql.Timestamp;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public void sendTimestamp() {
        int timestamp = (int)System.currentTimeMillis();
        System.out.println("Timestamp: " + timestamp);
        //TODO implement the logic to send to repository
    }
}
