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
public class AlgorithmChildPharStrepScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_phar_strep_screen_layout);

        myTextView = (TextView)findViewById(R.id.child_strep_content);

        String content = "<font color='#3399FF'> <strong>Children &lt; 12 years</strong></font> " +
                "single-dose benazthine penicillin 25,000 units/kg IM " +
                "(max. dose 1.2 million units)" +
                "or amoxicillin or penicillin V 50 mg/kg/day po divided or tid x 10 days " +
                "<br><br><br>" +
                " <font color='#33FF99'> <strong>Mild penicillin allergy:</strong> </font> <br>" +
                "cephalexin or cefadroxil" +
                "<br><br><br>" +
                " <font color='#EE0000'> <strong>Severe allergy:</strong></font> clindamycin" +
                "<br><br><Br>" +
                "<font color='#EE0000'> Children with strep pharyngitis should not return " +
                "to school or child care during the first 24 hrs after beginning treatment." +
                " Follow-up throat culture is not recommended. ";

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
