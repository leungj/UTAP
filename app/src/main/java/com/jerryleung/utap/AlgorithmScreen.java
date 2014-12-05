package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmScreen extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_screen_layout);

    }


    public void influenza_click(View view) {
        Intent getAlgorithmInfluenzaIntent = new Intent(this, ImmunizationInfluenzaScreen.class);
        final int result = 1;
        startActivity(getAlgorithmInfluenzaIntent);
    }

/*
    public void pneumonococcal_click(View view) {
        Intent getAlgorithmPneumonococcalIntent = new Intent(this, AlgorithmPneumonococcalScreen.class);
        final int result = 1;
        startActivity(getAlgorithmPneumonococcalIntent);
    }

    public void tdap_click(View view) {
        Intent getAlgorithmTDaPIntent = new Intent(this, AlgorithmTDaPScreen.class);
        final int result = 1;
        startActivity(getAlgorithmTDaPIntent);
    }
*/

    public void back_to_main(View view) {
        Intent goingBack = new Intent();
        setResult(RESULT_OK, goingBack);
        finish();
    }
}
