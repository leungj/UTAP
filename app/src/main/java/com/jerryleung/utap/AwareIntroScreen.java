package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;
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

//    TextView text = (TextView) findViewById(R.id.testtext);
//    text.setTextColor(Color.parseColor("#66CCFF"));

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
