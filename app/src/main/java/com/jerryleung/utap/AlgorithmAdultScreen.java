package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmAdultScreen extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_screen_layout);

    }

    public void pharyngitis_click(View view) {
        Intent getAlgorithmAdultPharIntent = new Intent(this, AlgorithmAdultPharScreen.class);
        final int result = 1;
        startActivity(getAlgorithmAdultPharIntent);
    }

    public void acute_click(View view) {
        Intent getAlgorithmAdultAcuteIntent = new Intent(this, AlgorithmAdultAcuteScreen.class);
        final int result = 1;
        startActivity(getAlgorithmAdultAcuteIntent);
    }

/*

    public void child_click(View view) {
        Intent getAlgorithmChildIntent = new Intent(this, AlgorithmChildScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildIntent);
    }
*/

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }
}
