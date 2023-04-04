package com.example.uplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.uplanner.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        public void signUp(View view) {
            Intent i = new Intent(getApplicationContext(), SignUpActivity.class);
            startActivity(i);}

        public void logIn(View view) {
            Intent j = new Intent(getApplicationContext(), LogInActivity.class);
            startActivity(j);}





} }