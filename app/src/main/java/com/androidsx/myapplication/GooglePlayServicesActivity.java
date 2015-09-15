package com.androidsx.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;


public class GooglePlayServicesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fabric.with(this, new Crashlytics());
        lambdaFun();
    }

    private void lambdaFun() {
        Runnable r = () -> Log.i("GooglePlayServicesActivity", "hey lambda");
        r.run();
    }
}
