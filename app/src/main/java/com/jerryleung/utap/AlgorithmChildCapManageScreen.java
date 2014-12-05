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
public class AlgorithmChildCapManageScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_cap_manage_screen_layout);

        myTextView = (TextView)findViewById(R.id.child_cap_manage_content);

        String content = "<font color='#33FF99'>Children < 5 years: </font> " +
                "<br>" +
                "Do not routinely require antibiotics since majority of cases of CAP " +
                "in this age group are of viral etiology" +
                "<br><br>" +
                "Amoxicillin or Amoxicillin-Clavulanate (45 mg/kg/day bid) " +
                "for presumed bacterial pneumonia" +
                "<br><br>" +
                "Use high dose Amoxicillin or Amoxicillin-Clavulanate (90 mg/kg/day bid) " +
                "if risk factor for penicillin-resistant pneumococcus present" +
                "<br><br>" +
                "<font color='#33FF99'>Children > 5 years: </font> " +
                "<br>" +
                "For presumed atypical pneumonia add coverage with:" +
                "<br>" +
                "azithromycin (10 mg/kg on day 1,<br> followed by 5 mg/kg " +
                "<br> once a day on days 2-5)" +
                "<br>" +
                "OR <br>" +
                "clarithromycin (15 mg/kg/day bid)" +
                "<br>" +
                "OR<br>" +
                "doxycycline for children > 8 years of age";

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
