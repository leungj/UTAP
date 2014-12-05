package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jerryleung on 11/19/14.
 */
public class TipsScreen extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_screen_layout);

    }

    public void resist_click(View view) {
        Intent getTipsResistIntent = new Intent(this, TipsResistScreen.class);
        final int result = 1;
        startActivity(getTipsResistIntent);
    }


    public void safety_click(View view) {
        Intent getTipsSafetyIntent = new Intent(this, TipsSafetyScreen.class);
        final int result = 1;
        startActivity(getTipsSafetyIntent);
    }

    public void providers_click(View view) {
        Intent getTipsProvidersIntent = new Intent(this, TipsProvidersScreen.class);
        final int result = 1;
        startActivity(getTipsProvidersIntent);
    }

    public void patients_click(View view) {
        Intent getTipsPatientsIntent = new Intent(this, TipsPatientsScreen.class);
        final int result = 1;
        startActivity(getTipsPatientsIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }
}
