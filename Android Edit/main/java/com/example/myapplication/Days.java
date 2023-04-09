package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Days extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);

        Button Monday = (Button) findViewById(R.id.button);
        Monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonMonday();
            }
        });
    }
    public void buttonMonday(){
        Intent I = new Intent(Days.this, Edit.class);
        startActivity(I);
    }
}