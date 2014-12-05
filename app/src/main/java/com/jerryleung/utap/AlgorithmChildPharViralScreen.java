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
public class AlgorithmChildPharViralScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_phar_viral_screen_layout);

        myTextView = (TextView)findViewById(R.id.child_viral_content);

        String content = "<font color='#3399FF'> <strong>Symptomatic Treatment</strong></font> " +
                "<br>" +
                "Avoid cigarette smoke" +
                "<br>" +
                "Gargle with dilute salt water" +
                "<br>" +
                "Acetaminophen or <br> ibuprofen PRN for pain" +
                "<br>" +
                "Throat lozenges" +
                "<br>" +
                "Hydration" +
                "<br>" +
                "Rest" +
                "<br><br><br>" +
                "For children, a negative rapid antigen test " +
                "should be confirmed with a throat culture.";

        myTextView.setText(Html.fromHtml(content));

    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
