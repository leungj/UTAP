package com.jerryleung.utap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tips_click(View view) {
        Intent getTipsScreenIntent = new Intent(this, TipsScreen.class);
        final int result = 1;
        startActivity(getTipsScreenIntent);
    }

    public void aware_click(View view) {
        Intent getAwareIntroScreenIntent = new Intent(this, AwareIntroScreenTwo.class);
        final int result = 1;
        startActivity(getAwareIntroScreenIntent);
    }

    public void immunization_click(View view) {
        Intent getImmunizationScreenIntent = new Intent(this, ImmunizationScreen.class);
        final int result = 1;
        startActivity(getImmunizationScreenIntent);
    }

    public void algorithm_click(View view) {
        Intent getAlgorithmScreenIntent = new Intent(this, AlgorithmScreen.class);
        final int result = 1;
        startActivity(getAlgorithmScreenIntent);
    }

    public void reference_click(View view) {
        Intent getReferenceScreenIntent = new Intent(this, ReferenceScreen.class);
        final int result = 1;
        startActivity(getReferenceScreenIntent);
    }

}
