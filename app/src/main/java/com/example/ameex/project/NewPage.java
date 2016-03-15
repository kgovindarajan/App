package com.example.ameex.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by ameex on 14/3/16.
 */
public class NewPage extends Activity {
    static NewPage activity;

    @Override
    protected  void onCreate(Bundle savedINstanceState) {
        super.onCreate(savedINstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.new_page);
/*
        act.getInstance().finish();
*/
    }

    public void onSIgnInClick(View v) {
        Intent i = new Intent(NewPage.this,GettingStartedOne.class);
        startActivity(i);
    }

    public void onSIgnUpClick(View v) {
        Intent i = new Intent(NewPage.this,SignUpActivity.class);
        startActivity(i);
    }


    /*public static NewPage getIns() {
        return activity;
    }*/


}
