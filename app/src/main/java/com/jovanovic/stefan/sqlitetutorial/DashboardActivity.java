package com.jovanovic.stefan.sqlitetutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    String EmailHolder;
    TextView Email;
    ImageView LogOUT;

    private ImageView inci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Email = (TextView) findViewById(R.id.textView1);
        LogOUT = (ImageView) findViewById(R.id.logOut);

        inci = (ImageView) findViewById(R.id.viewIncidents);
        inci.setOnClickListener(this);

        Intent intent = getIntent();

        // Receiving User Email Send By MainActivity.
        EmailHolder = intent.getStringExtra(LoginActivity.UserEmail);

        // Setting up received email to TextView.
        Email.setText(Email.getText().toString() + EmailHolder);

        // Adding click listener to Log Out button.
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Finishing current DashBoard activity on button click.
                finish();

                Toast.makeText(DashboardActivity.this, "Log Out Successful", Toast.LENGTH_LONG).show();

            }
        });

        // Map
        ImageView maps = (ImageView) findViewById(R.id.mapLocation);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Welcome to maps", Toast.LENGTH_SHORT).show();
                Intent intentMap = new Intent(DashboardActivity.this, MapsActivity.class);
                startActivity(intentMap);
            }
        });

        ImageView deleteImageView = (ImageView) findViewById(R.id.deleteImageView);
        deleteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Delete Record", Toast.LENGTH_SHORT).show();
                Intent intentDel = new Intent(DashboardActivity.this, AddActivity.class);
                startActivity(intentDel);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.viewIncidents:
                startActivity(new Intent(this, MainActivity.class));

        }
    }
}

