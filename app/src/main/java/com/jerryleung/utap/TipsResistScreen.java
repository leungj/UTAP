package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class TipsResistScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_resist_screen_layout);

        myTextView = (TextView)findViewById(R.id.tips_resist_content);
        /*
        SpannableString ss = new SpannableString("abc");
        ImageSpan is = new ImageSpan(R.)
        */
        String content = "Each year in the United States, approximately 2 million people will" +
                " acquire a serious infection that are resistant to one or more of the antibiotics " +
                "used to treat them.  At least 23,000 people die each year as a direct result" +
                " of these.  Many more people die from conditions complicated by " +
                "antibiotic-resistant bacteria.  Antibiotic-resistant infections may require " +
                "prolonged and/or more costly treatment, extended hospital stays, necessitate " +
                "additional doctor visits, and result in higher rates of disability and death " +
                "than susceptible bacteria. " +
                "<br><br>" +
                "Up to 50% of all antibiotics prescribed are not needed or are not " +
                "optimally effective as prescribed. Responsible use of antibiotics plays a vital " +
                "role in preventing antibiotic resistance. ";

        myTextView.setText(Html.fromHtml(content));
        myTextView.setMovementMethod(new ScrollingMovementMethod());


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
