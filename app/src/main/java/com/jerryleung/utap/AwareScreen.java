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
public class AwareScreen extends Activity{

    TextView main_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aware_screen_layout);

//        main_content = (TextView)findViewById(R.id.main_content);

//        main_content.setMovementMethod(new ScrollingMovementMethod());
    }

    public void use_click(View view) {
        Intent getUseOfAntibioticsIntent = new Intent(this, AwareUseOfAntibioticsScreen.class);
        final int result = 1;
        startActivity(getUseOfAntibioticsIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent();
        setResult(RESULT_OK, goingBack);
        finish();
    }

}
