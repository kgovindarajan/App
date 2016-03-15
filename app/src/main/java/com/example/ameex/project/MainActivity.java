package com.example.ameex.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;

public class MainActivity extends Activity {
    static MainActivity act;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent i = new Intent(MainActivity.this,NewPage.class);
        startActivity(i);*//*
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(MainActivity.this, NewPage.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
                try {
                    this.finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        }, 5000);*/


        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                        Intent i = new Intent(MainActivity.this, NewPage.class);
                        startActivity(i);
                }

            }

        };

        timer.start();

    }
    /*public static MainActivity getInstance(){
        return act;*//*
         activity.getIns().finish();
    }*/


}
