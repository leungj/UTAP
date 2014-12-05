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
public class ReferenceScreen extends Activity{

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.references_screen_layout);

        myTextView = (TextView)findViewById(R.id.references_content);

        String content = "1.Ventola CL. Mobile Devices and Apps for Health Care Professionals:" +
                " Uses and Benefits. Pharmacy and Therapeutics 2014;39(5):356-364." +
                "<br><br>" +
                "2.Divali P, Camosso-Stefinovic J, Baker R. Use of personal digital assistants in " +
                "clinical decision making by health care professionals: a systematic review. " +
                "Health Informatics J 2013;19(1):16–28." +
                "<br><br>" +
                "3.Mickan S, Tilson JK, Atherton H, et al. Evidence of effectiveness of health " +
                "care professionals using handheld computers; a scoping review of " +
                "systematic reviews. J Med Internet Res 2013;15(10):e21." +
                "<br><br>" +
                "4.Antibiotic Resistance Threats in the United States. 2013. US " +
                "Department of Health and Human Services, Center for Disease Control and Prevention " +
                "[online]. Available at:http://www.in.gov/isdh/files/" +
                "CDC_Antibiotic_Resistance_Threats_2013_Final.pdf. Accessed November 25, 2014." +
                "<br><br>" +
                "5.Influenza Vaccine: A Summary for Clinicians. " +
                "Centers for Disease Control and Prevention Website. 2014 August. " +
                "Accessed November 14, 2014. Available at: http://www.cdc.gov/flu/professionals/" +
                "vaccination/vax-summary.htm." +
                "<br><br>" +
                "6.Pneumococcal Vaccination. Centers for Disease Control and Prevention Website." +
                " 2014 September. Accessed November 14, 2014. Available at: " +
                "http://www.cdc.gov/vaccines/vpd-vac/pneumo/default.htm." +
                "<br><br>" +
                "7.Pertussis: Summary of Vaccination Recommendations. " +
                "Centers for Disease Control and Prevention Website. " +
                "http://www.cdc.gov/vaccines/vpd-vac/pertussis/recs-summary.htm." +
                "Published August 28, 2013. Accessed November 14, 2014." +
                "<br><br>" +
                "8.Practice Guidance for Judicious Use of Antibiotics. " +
                "Oregon AWARE. August 2013. Accessed on December 3, 2014. Available at: " +
                "https://public.health.oregon.gov/PreventionWellness/SafeLiving/" +
                "AntibioticResistance/Documents/JudiciousUseAlgorithms.pdf.";

        myTextView.setText(Html.fromHtml(content));
        myTextView.setMovementMethod(new ScrollingMovementMethod());

    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent();
        setResult(RESULT_OK, goingBack);
        finish();
    }
}
