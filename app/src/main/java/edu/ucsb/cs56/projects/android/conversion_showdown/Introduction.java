package edu.ucsb.cs56.projects.android.conversion_showdown;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;

/**
 * Introduction page after Splash Screen and Welcome
 */
public class Introduction extends Activity implements OnClickListener {

    Button btnStartAnotherActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        Button startQuizButton = (Button) findViewById( R.id.startQuizButton);
        Button startConverterButton = (Button) findViewById( R.id.startConverterButton );
        Button tutorialButton = (Button) findViewById(R.id.tutorialButton);

        TextView resp = (TextView) findViewById(R.id.response);
        Intent intent = getIntent();
        String name = intent.getStringExtra(Welcome.EXTRA_NAME);
        resp.setText("Welcome " + name + "!");


        startQuizButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), QuizSelection.class);
                MyUtils.startNoHistoryAcitivity( getActivity(), intent );
            }

        });

        startConverterButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConverterActivity.class);
                MyUtils.startNoHistoryAcitivity( getActivity(), intent );
            }
        });

        tutorialButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tutorial.class);
                MyUtils.startNoHistoryAcitivity( getActivity(), intent );
            }
        });

        btnStartAnotherActivity = (Button) findViewById(R.id.btnStartAnotherActivity);

        btnStartAnotherActivity.setOnClickListener(this);
    }

    public Activity getActivity(){
        return this;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, baseCalculator.class);
        MyUtils.startNoHistoryAcitivity( this, intent );
    }

    /**
     * Inflate the menu; this adds items to the action bar if it is present.
     * @param menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handle action bar item clicks here. The action bar will
     * automatically handle clicks on the Home/Up button, so long
     * as you specify a parent activity in AndroidManifest.xml.
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
