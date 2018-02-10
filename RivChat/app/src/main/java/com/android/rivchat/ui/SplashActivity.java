package com.android.rivchat.ui;

import com.android.rivchat.R;
import com.android.rivchat.util.Preferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        if (Preferences.getFirstRun(this)) {
            //First Run Activity
            startActivity(new Intent(this, IntroActivity.class));
        }

        if (!Preferences.getPaid(this)){
            Toast.makeText(this, "You haven't paid yet!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, IntroActivity.class));
        }

        if (Preferences.getPaid(this))
            startActivity(new Intent(this, LoginActivity.class));
    }
}
