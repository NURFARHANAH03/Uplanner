package com.example.uplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.uplanner.databinding.ActivityLogInBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity {

    private ActivityLogInBinding binding;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLogInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAuth = FirebaseAuth.getInstance();

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.editTextEmail.getText().toString();
                String password = binding.editTextPassword.getText().toString();

                if (isValidEmail(email) && password.length() > 0) {
                    // Show the progress bar
                    binding.progressBar.setVisibility(View.VISIBLE);

                    mAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        Toast.makeText(LogInActivity.this, "Authentication successful.",
                                                Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                                        startActivity(intent);
                                        finish();
                                    } else {
                                        // Sign in failed
                                        Toast.makeText(LogInActivity.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                    // Hide the progress bar
                                    binding.progressBar.setVisibility(View.GONE);
                                }
                            });
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter a valid email and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.goToSignUp.setOnClickListener(view -> {
            Intent j = new Intent(getApplicationContext(), SignUpActivity.class);
            startActivity(j);
            finish();
        });
    }

    private boolean isValidEmail(String email) {
        // Add your own email validation logic here
        return email.contains("@");
    }
}
