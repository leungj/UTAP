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
public class AlgorithmAdultAcuteSevereScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_acute_severe_screen_layout);

        myTextView = (TextView)findViewById(R.id.adult_acute_severe_content);

        String content = "Amoxicillin 1g po bid 5-7 days" +
                "<br> <br>" +
                "Use high dose amoxicillin (2 g po bid) if at risk for PCN resistance ≥ 10%" +
                "<br> <br>" +
                "Treatment failure: high dose amoxicillin-clavulanate " +
                "<br> <br>" +
                "If PCN allergy: Doxycycline"+
                "<br> <br>" +
                "<strong>Adjunctive Therapy:</strong> " +
                "<br>" +
                "Nasal corticosteroid spray" +
                "<br>" +
                "Sinus irrigation" +
                "<br> <br>" +
                "<font color='#EE0000'> If no improvement after 72 hours, " +
                "consider imaging or ENT consult. </font>";

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
