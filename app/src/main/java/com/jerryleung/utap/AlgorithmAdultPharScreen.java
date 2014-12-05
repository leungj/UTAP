package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmAdultPharScreen extends Activity{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_phar_screen_layout);
        imageView = (ImageView) findViewById(R.id.pneumo_image);
    }

    public void strep_click(View view) {
        Intent getAlgorithmAdultPharStrepIntent = new Intent(this, AlgorithmAdultPharStrepScreen.class);
        final int result = 1;
        startActivity(getAlgorithmAdultPharStrepIntent);
    }

    public void viral_click(View view) {
        Intent getAlgorithmAdultPharViralIntent = new Intent(this, AlgorithmAdultPharViralScreen.class);
        final int result = 1;
        startActivity(getAlgorithmAdultPharViralIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
