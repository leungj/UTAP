package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmChildScreen extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_screen_layout);

    }


    public void phar_click(View view) {
        Intent getAlgorithmChildPharIntent = new Intent(this, AlgorithmChildPharScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildPharIntent);
    }

    public void acute_click(View view) {
        Intent getAlgorithmChildAcuteIntent = new Intent(this, AlgorithmChildAcuteScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildAcuteIntent);
    }

    public void cough_click(View view) {
        Intent getAlgorithmChildCoughIntent = new Intent(this, AlgorithmChildCoughScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildCoughIntent);
    }

    public void cap_click(View view) {
        Intent getAlgorithmChildCapIntent = new Intent(this, AlgorithmChildCapScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildCapIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }
}
