package com.example.sm.quranread;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView im=new ImageView(this);
        im.setImageResource(R.drawable.quran);
        setContentView(im);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        start();
                    }
                });

            }
        },2000);
    }
    public void start(){
        startActivity(new Intent(this,ListActivity.class));
        finish();
    }
}
