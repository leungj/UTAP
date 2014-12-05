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
public class TipsPatientsScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_patients_screen_layout);

        myTextView = (TextView)findViewById(R.id.tips_patients_content);

        String content = "Take antibiotics only as prescribed by their doctor and " +
                "complete the prescribed course of treatment." +
                "<br><br>" +
                "Notify their doctor if they’ve been on antibiotics and" +
                " have experienced diarrhea within the last few months." +
                "<br><br>" +
                "Wash their hands prior to meals and after using the restroom." +
                "<br><br>" +
                "<font color='#3399FF'><strong>The following core actions will help fight " +
                "these deadly infections:</strong></font>" +
                "<br>" +
                "Preventing infections and preventing the spread of resistance" +
                "<br>" +
                "Tracking resistant bacteria" +
                "<br>" +
                "Improving the use of today’s antibiotics" ;

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
