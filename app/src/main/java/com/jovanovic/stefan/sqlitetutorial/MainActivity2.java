package com.jovanovic.stefan.sqlitetutorial;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
// Splash Screen

public class MainActivity2 extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView logo_id = (ImageView) findViewById(R.id.logo_id);
        TextView textViewLogo = (TextView) findViewById(R.id.textViewLogo);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity2.this, "Welcome to the Traffic Application App", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}