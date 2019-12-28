package com.timestamper.Web;

import android.content.Context;

import com.timestamper.R;
import com.timestamper.model.Timestamp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TimestamperAPIController implements Callback<Timestamp> {

    private TimestamperAPI timestamperAPI;

    public void start(Context context) {
        String BASE_URL = context.getResources().getString(R.string.base_url);
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        this.timestamperAPI = retrofit.create(TimestamperAPI.class);
    }

    public void createTimestamp(Timestamp timestamp) {
        Call<Timestamp> createTimestampCall = timestamperAPI.createTimestamp(timestamp);
        createTimestampCall.enqueue(this);
    }

    @Override
    public void onResponse(Call<Timestamp> call, Response<Timestamp> response) {
        System.out.println(response.code());
    }

    @Override
    public void onFailure(Call<Timestamp> call, Throwable t) {
        t.printStackTrace();
    }
}
