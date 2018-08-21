package com.trial.efcorp.iqa;

import android.app.Application;

import com.firebase.client.Firebase;


public class QuizOnline extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
