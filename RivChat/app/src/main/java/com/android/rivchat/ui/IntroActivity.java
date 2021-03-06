package com.android.rivchat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.android.rivchat.R;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("1", "", R.drawable.circle_background, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("2", "", R.drawable.circle_background, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("3", "", R.drawable.circle_background, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("4", "", R.drawable.circle_background, getResources().getColor(R.color.colorPrimary)));

        setFlowAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(this, LoginActivity.class));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(this, LoginActivity.class));
    }
}