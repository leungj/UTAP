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
public class AlgorithmAdultCapManageScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_adult_cap_manage_screen_layout);

        myTextView = (TextView)findViewById(R.id.adult_cap_manage_content);

        String content = "<font color='#33FF99'>Previously healthy, " +
                "no recent (within 3 months) antibiotic therapy: </font> " +
                "<br>" +
                "Azithromycin, clarithromycin or doxycycline" +
                "<br><br>" +
                "<font color='#3399FF'>Antibiotics within the last 3 months " +
                "or comorbidities:</font>" +
                "<br>" +
                "Azithromycin or clarithromycin <br>" +
                "AND <br>" +
                "High dose amoxicillin, amoxicillin-claulanate," +
                "cefdinir, cefpodoxime, cefprozil, or cefuroxime <br>" +
                "A respiratory fluoroquinolone" +
                "<br><br>" +
                "<font color='#EE0000'>Inpatients </font><br>" +
                "Advanced macrolide PLUS a beta-lactam <br>" +
                "Respiratory fluoroquinolone";

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
