package com.example.visionsys.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

                                      // Using handler with postDelayed called runnable run method

                                      @Override
                                      public void run() {
                                          Intent i = new Intent(splashActivity.this, MainActivity.class);
                                          startActivity(i);

                                          // close this activity
                                          finish();
                                      }
                                  },
                5*1000); // wait for 5 seconds

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}

