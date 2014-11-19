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
public class AwareScreen extends Activity{

    TextView main_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aware_screen_layout);

//        main_content = (TextView)findViewById(R.id.main_content);

//        main_content.setMovementMethod(new ScrollingMovementMethod());
    }

    public void use_click(View view) {
        Intent getUseOfAntibioticsIntent = new Intent(this, AwareUseOfAntibioticsScreen.class);
        final int result = 1;
        startActivity(getUseOfAntibioticsIntent);
    }

    public void media_click(View view) {
        Intent getOtitisMediaIntent = new Intent(this, AwareOtitisMediaScreen.class);
        final int result = 1;
        startActivity(getOtitisMediaIntent);
    }

    public void infection_click(View view) {
        Intent getInfectionsIntent = new Intent(this, AwareInfectionScreen.class);
        final int result = 1;
        startActivity(getInfectionsIntent);
    }

    public void resistance_click(View view) {
        Intent getAntibioticResistanceIntent = new Intent(this, AwareAntibioticResistanceScreen.class);
        final int result = 1;
        startActivity(getAntibioticResistanceIntent);
    }

    public void antimicrobial_click(View view) {
        Intent getAntimicrobialIntent = new Intent(this, AwareAntimicrobialScreen.class);
        final int result = 1;
        startActivity(getAntimicrobialIntent);
    }

    public void back_to_main(View view) {
        Intent goingBack = new Intent(this, MainActivity.class);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        goingBack.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityIfNeeded(goingBack, 0);
    }

}
