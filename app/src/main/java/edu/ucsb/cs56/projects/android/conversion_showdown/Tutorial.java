package edu.ucsb.cs56.projects.android.conversion_showdown;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * It will bring up a new activity where contains several conversion tutorial documentations when users click "Tutorial" on the main page.
 * Created by Claudia Zeng and Kerry Mo on 03/13/2018.
 */

public class Tutorial extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);

        Button decBinButton = (Button) findViewById(R.id.Dec2Bin2Dec);
        Button hexDecButton = (Button) findViewById(R.id.Hex2Dec2Hex);

        Intent intent = getIntent();

        decBinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), decBinTutorial.class);
                MyUtils.startNoHistoryAcitivity(getActivity(), intent);
            }
        });

        hexDecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), hexDecTutorial.class);
                MyUtils.startNoHistoryAcitivity(getActivity(), intent);
            }
        });
    }

    public Activity getActivity() {
        return this;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
