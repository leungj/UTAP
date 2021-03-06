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

    public void adults_click(View view) {
        Intent getAlgorithmAdultIntent = new Intent(this, AlgorithmAdultScreen.class);
        final int result = 1;
        startActivity(getAlgorithmAdultIntent);
    }


    public void child_click(View view) {
        Intent getAlgorithmChildIntent = new Intent(this, AlgorithmChildScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }
}
