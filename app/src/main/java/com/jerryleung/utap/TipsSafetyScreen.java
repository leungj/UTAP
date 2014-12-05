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
public class TipsSafetyScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_safety_screen_layout);

        myTextView = (TextView)findViewById(R.id.tips_safety_content);

        String content = "Antibiotics can have serious side effects, including allergic reactions " +
                "and potentially deadly diarrhea caused by the bacteria clostridium difficile." +
                "  When someone takes unnecessary antibiotics they’re exposing themselves antibiotic" +
                " side effects without receiving any benefit." +
                "<br><br>" +
                "<font color='#3399FF'><strong>Allergic Reactions:</strong></font>" +
                " Every year, there are more than 140,000 emergency " +
                "department visits for reactions to antibiotics." +
                "<br><br> " +
                "<font color='#EE0000'><strong>C. Difficile: </strong></font>" +
                "C. difficile related diarrhea has been linked to 14,000 American deaths" +
                " each year and is a serious concern when using antibiotics for any reason.";

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
