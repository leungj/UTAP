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
public class TipsProvidersScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_providers_screen_layout);

        myTextView = (TextView)findViewById(R.id.tips_providers_content);

        String content = "Prescribe antibiotics carefully.  Once culture results are available," +
                " check whether the prescribed antibiotics are correct and necessary." +
                "<br><br>" +
                "Order a C. difficile test if the patient has had 3 " +
                "or more unformed stools within 24 hours." +
                "<br><br>" +
                "Be aware of infection rates in your facility or practice," +
                " and follow infection control recommendations with each patient.";

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
