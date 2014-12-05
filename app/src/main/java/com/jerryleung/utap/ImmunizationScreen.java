package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jerryleung on 11/19/14.
 */
public class ImmunizationScreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.immunization_screen_layout);
    }

    public void influenza_click(View view) {
        Intent getImmunizationInfluenzaIntent = new Intent(this, ImmunizationInfluenzaScreen.class);
        final int result = 1;
        startActivity(getImmunizationInfluenzaIntent);
    }

    public void pneumonococcal_click(View view) {
        Intent getAlgorithmPneumonococcalIntent = new Intent(this, ImmunizationPneumonococcalScreen.class);
        final int result = 1;
        startActivity(getAlgorithmPneumonococcalIntent);
    }

    public void tdap_click(View view) {
        Intent getImmunizationTDaPIntent = new Intent(this, ImmunizationTdapScreen.class);
        final int result = 1;
        startActivity(getImmunizationTDaPIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent();
        setResult(RESULT_OK, goingBack);
        finish();
    }
}
