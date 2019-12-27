package com.timestamper.Web;

import com.timestamper.model.Timestamp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TimestamperWebservice {

    @POST("/timestamps")
    Call<Timestamp> createTimestamp(@Body Timestamp timestamp);
}
