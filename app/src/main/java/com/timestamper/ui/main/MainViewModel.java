package com.timestamper.ui.main;

import android.util.Log;

import com.timestamper.model.Timestamp;
import com.timestamper.repository.MainRepository;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    MainRepository mainRepository = new MainRepository();

    public void sendTimestamp() {
        Timestamp timestamp = new Timestamp();
        mainRepository.sendTimestamp(timestamp);
    }
}
