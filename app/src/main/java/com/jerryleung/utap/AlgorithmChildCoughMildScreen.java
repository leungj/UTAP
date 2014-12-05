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
public class AlgorithmChildCoughMildScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_cough_mild_screen_layout);

        myTextView = (TextView)findViewById(R.id.child_cough_mild_content);

        String content = "Do not use antibiotics for cough" +
                " < 4 weeks in a well-appearing child " +
                "without clinical evidence of pneumonia." +
                "<br> <br> <br>" +
                "<strong>Therapeutic measures include:</strong>" +
                "<br>" +
                "Avoid cigarette smoke <br>" +
                "Nasal saline washes <br>" +
                "Drink plenty of liquids <br>" +
                "Topical vapor rubs <br>" +
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
