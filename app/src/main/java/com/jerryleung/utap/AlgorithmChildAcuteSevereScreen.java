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
public class AlgorithmChildAcuteSevereScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithm_child_acute_severe_screen_layout);

        myTextView = (TextView)findViewById(R.id.child_acute_severe_content);

        String content = "Amoxicillin 45 mg/kg/day bid x 7-10 days" +
                "<br> <br>" +
                "Use high dose amoxicillin (90 mg/kg/day bid)) " +
                "if at risk for PCN resistance ≥ 10%, age < 2 years, " +
                "day care exposure, immunocompromise, recent hospitalization " +
                "or abx use in past 3 months. " +
                "<br> <br>" +
                "Treatment failure: <br> high dose amoxicillin-clavulanate " +
                "<br> <br>" +
                "Mild PCN allergy: <br> cefixime, cefpodoxime or cefdinir" +
                "<br><br>" +
                "Sever PCN allergy: <br> levofloxacin or doxycycline (if age > 8 years) " +
                "<br><br>" +
                "<font color='#EE0000'>If no improvement after 72 hours, " +
                "consider imaging or ENT consult.</font>" ;

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
