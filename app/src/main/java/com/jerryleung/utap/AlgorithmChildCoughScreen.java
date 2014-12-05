package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmChildCoughScreen extends Activity{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_cough_screen_layout);
        imageView = (ImageView) findViewById(R.id.cough_image);
    }

    public void mild_click(View view) {
        Intent getAlgorithmChildCoughMildIntent = new Intent(this, AlgorithmChildCoughMildScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildCoughMildIntent);
    }

    public void severe_click(View view) {
        Intent getAlgorithmChildCoughSevereIntent = new Intent(this, AlgorithmChildCoughSevereScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildCoughSevereIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
