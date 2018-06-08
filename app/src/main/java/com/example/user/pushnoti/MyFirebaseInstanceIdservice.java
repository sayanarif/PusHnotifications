package com.example.user.pushnoti;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdservice extends FirebaseInstanceIdService {

    private static final String Reg_token="REG_TOKEN";

    @Override
    public void onTokenRefresh() {
        String recent_token= FirebaseInstanceId.getInstance().getToken();
        Log.d(Reg_token,recent_token);

    }
}
