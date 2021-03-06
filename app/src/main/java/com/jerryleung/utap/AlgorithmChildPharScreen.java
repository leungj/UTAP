package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmChildPharScreen extends Activity{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_phar_screen_layout);
        imageView = (ImageView) findViewById(R.id.childphar_image);
    }

    public void strep_click(View view) {
        Intent getAlgorithmChildPharStrepIntent = new Intent(this, AlgorithmChildPharStrepScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildPharStrepIntent);
    }

    public void viral_click(View view) {
        Intent getAlgorithmChildPharViralIntent = new Intent(this, AlgorithmChildPharViralScreen.class);
        final int result = 1;
        startActivity(getAlgorithmChildPharViralIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
