package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmAdultCoughMildScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_cough_mild_screen_layout);

        myTextView = (TextView)findViewById(R.id.adult_cough_mild_content);

        String content = "<font color='#3399FF'> Do not use antibiotics for cough" +
                " < 21 days in a well-appearing adult.</font>" +
                "<br> <br> <br>" +
                "<strong>Therapeutic measures include:</strong>" +
                "<br>" +
                "Avoid cigarette smoke <br>" +
                "Consider bronchodilators <br>" +
                "Drink plenty of liquids <br>" +
                "Steam to loosen secretions <br>" +
                "Acetaminophen or ibuprofen PRN <br>" +
                "Rest";

        myTextView.setText(Html.fromHtml(content));
        myTextView.setMovementMethod(new ScrollingMovementMethod());

    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
