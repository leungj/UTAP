package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AwareIntroScreen extends Activity{

    TextView main_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aware_intro_screen_layout);

//        main_content = (TextView)findViewById(R.id.main_content);

//        main_content.setMovementMethod(new ScrollingMovementMethod());
    }

    public void aware_intro_click(View view) {
        Intent getAwareScreenIntent = new Intent(this, AwareScreen.class);
        final int result = 1;
        startActivity(getAwareScreenIntent);
    }

}
