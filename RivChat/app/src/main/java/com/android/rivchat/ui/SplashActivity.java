package com.android.rivchat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.android.rivchat.R;
import com.android.rivchat.util.Preferences;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        final int interval = 1733;
        Handler handler = new Handler();
        Runnable runnable = new Runnable(){
            public void run() {
                if (Preferences.getFirstRun(SplashActivity.this)) {
                    //First Run Activity
                    startActivity(new Intent(SplashActivity.this, IntroActivity.class));
                    finish();
                } else if (!Preferences.getPaid(SplashActivity.this)) {
                    Toast.makeText(SplashActivity.this, "You haven't paid yet!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SplashActivity.this, IntroActivity.class));
                    finish();
                } else if (Preferences.getPaid(SplashActivity.this)) {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };

        handler.postAtTime(runnable, System.currentTimeMillis()+interval);
        handler.postDelayed(runnable, interval);
    }
}
