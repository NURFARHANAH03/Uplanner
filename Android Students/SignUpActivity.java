package com.example.uplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.uplanner.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;

    private String[] utpProgram = {"Chemical Engineering", "Civil Engineering", "Computer Engineering", "Electrical Engineering", "Materials Engineering", "Mechanical Engineering", "Petroleum Engineering", "Computer Science", "Information Technology", "Information System", "Business Management", "Petroleum Geoscience", "Applied Chemistry"};
    private String[] yearStudy = {"Foundation", "First Year", "Second Year", "Third Year", "Fourth Year"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, utpProgram);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerProgram.setAdapter(adapter);

        ArrayAdapter<String> adapters = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, yearStudy);
        adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerYearStudy.setAdapter(adapters);

        binding.buttonSignUp.setOnClickListener(this::onClick);

        binding.goToLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LogInActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void onClick(View view) {
        String name = binding.editTextName.getText().toString();
        String utpEmail = binding.editTextEmail.getText().toString();
        String password = binding.editTextPassword.getText().toString();
        String matricID = binding.editTextMatricID.getText().toString();
        String utpProgram = binding.spinnerProgram.getSelectedItem().toString();
        String YearStudy = binding.spinnerYearStudy.getSelectedItem().toString();

        int levelStudyId = binding.radioGroupLevelStudy.getCheckedRadioButtonId();
        String levelStudy;
        if (levelStudyId == R.id.radioButtonFSem) {
            levelStudy = "First Semester";
        } else if (levelStudyId == R.id.radioButtonSSem) {
            levelStudy = "Second Semester";
        } else if (levelStudyId == R.id.radioButtonTSem) {
            levelStudy = "Third Semester";
        } else {
            levelStudy = "";
        }

        if (name.isEmpty() || utpEmail.isEmpty() || password.isEmpty() || matricID.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please fill all the required fields", Toast.LENGTH_SHORT).show();
        } else {
            // Show the progress bar
            binding.progressBar.setVisibility(View.VISIBLE);

            //TODO: Perform Sign Up Action
            // Create a new instance of the FirebaseAuth class
            FirebaseAuth mAuth = FirebaseAuth.getInstance();

// Get the user's email and password from the text fields
            String email = binding.editTextEmail.getText().toString();
            password = binding.editTextPassword.getText().toString();

// Use the createUserWithEmailAndPassword method to create a new user account
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            // Hide the progress bar
                            binding.progressBar.setVisibility(View.GONE);

                            if (task.isSuccessful()) {
                                // Sign up success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                                Toast.makeText(getApplicationContext(), "Sign up successful", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);
                                finish();
                            } else {
                                // If sign up fails, display a message to the user
                                Toast.makeText(getApplicationContext(), "Sign up failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


        }
    }
}
