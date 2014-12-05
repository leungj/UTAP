package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmAdultAcuteMildScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_acute_mild_screen_layout);

        myTextView = (TextView)findViewById(R.id.adult_acute_mild_content);

        String content = "Nasal corticosteroid spray" +
                "<br> <br> <br>" +
                "Sinus irrigation" +
                "<br> <br> <br>" +
                "Acetaminophen or ibuprofen PRN" +
                "<br> <br> <br>" +
                "Supportive care ";

        myTextView.setText(Html.fromHtml(content));

    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
