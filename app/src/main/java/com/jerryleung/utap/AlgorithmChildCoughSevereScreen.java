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
public class AlgorithmChildCoughSevereScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_cough_severe_screen_layout);

        myTextView = (TextView)findViewById(R.id.child_cough_severe_content);

        String content = "Treat confirmed <em>B. pertussis</em>" +
                " with a macrolide (azithromycin or clarithromycin)" +
                "<br><br>" +
                "Treat <em>M. pneumoniae</em> or <em>C. pneumoniae</em>" +
                "with a macrolide (azithromycin or clarithromycin) or, if > 8 years, doxycycline." +
                "<br><br>" +
                "For other etiologies, direct therapy to the specific underlying cause.";

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
