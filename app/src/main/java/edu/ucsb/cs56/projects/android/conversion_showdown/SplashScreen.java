package edu.ucsb.cs56.projects.android.conversion_showdown;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/**
 * Splash screen implementation. This is the first screen the user will see when the application starts
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000); //lasts for 3 seconds
                    Intent intent = new Intent(getApplicationContext(), Welcome.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e){
                        e.printStackTrace();

                }
            }
        };

            myThread.start();
    }
}
