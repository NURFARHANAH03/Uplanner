package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})

        Button Schedule = (Button) findViewById(R.id.schedule);
        Schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentimetable();
            }
        });
    }
   public void opentimetable(){
        Intent I = new Intent(MainActivity.this, Days.class);
        startActivity(I);
    }
}