package com.timestamper.ui.main;

import android.content.Context;

import com.timestamper.model.Timestamp;
import com.timestamper.repository.MainRepository;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    static private MainRepository mainRepository = new MainRepository();

    public void sendTimestamp(Context context) {
        Timestamp timestamp = new Timestamp();
        mainRepository.sendTimestamp(timestamp, context);
    }
}
