package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class AlgorithmAdultPharStrepScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_phar_strep_screen_layout);

        myTextView = (TextView)findViewById(R.id.adult_strep_content);

        String content = "<font color='#3399FF'> <strong>Adults:</strong></font> " +
                "single-dose benzathine <br> penicillin " +
                "1.2 million units IM <br> or penicillin V 500 mg po bid x 10 days.<br> <br> <br>" +
                " <font color='#33FF99'> <strong>Mild penicillin allergy:</strong> </font> <br>" +
                " (no hives or anaphylaxis): <br> cephalexin or cefdroxil <br> <br> <br>" +
                " <font color='#EE0000'> <strong>Severe allergy:</strong></font> clindamycin";

        myTextView.setText(Html.fromHtml(content));

        /*
        myTextView.setText(first + next, TextView.BufferType.SPANNABLE);
        Spannable s = (Spannable)t.getText();
        int start = first.length();
        int end = start + next.length();
        s.setSpan(new ForegroundColorSpan(0xFFFF0000), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        */

    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
