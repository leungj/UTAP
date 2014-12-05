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
public class AlgorithmAdultCoughSevereScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_cough_severe_screen_layout);

        myTextView = (TextView)findViewById(R.id.adult_cough_severe_content);

        String content = "Obtain CXR." +
                "<br> <br>" +
                "Treat COPD exacerbation with <br> one of the following: <br>" +
                "Amoxicillin<br>" +
                "TMP-SMX <br>" +
                "Doxycycline" +
                "<br> <br>" +
                "AND a short course (7-10 days) of oral corticosteroids" +
                "<br> <br> <br>" +
                "Treat confirmed " +
                "<em>B. pertussis, M. pneumoniae or C. pneumonia </em>" +
                "with azithromycin or clarithromycin" ;

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
