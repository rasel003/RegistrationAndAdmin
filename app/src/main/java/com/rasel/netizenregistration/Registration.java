package com.rasel.netizenregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class Registration extends AppCompatActivity {

    TextInputEditText etFullName, etMobileNum, etEmail, etPassword;
    String fullName, mobileNumber, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etFullName = findViewById(R.id.etFullName);
        etMobileNum = findViewById(R.id.etMobileNum);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
    }

    public void btnRegistrationClicked(View view) {

        if(inputValidation()){

        }
    }

    private boolean inputValidation() {
        boolean valid = true;
        fullName = etFullName.getText().toString();
        mobileNumber = etMobileNum.getText().toString();
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();

        if(fullName.trim().isEmpty()){
            valid = false;
        }
        if(mobileNumber.trim().isEmpty()){
            valid = false;
        }
        if(email.trim().isEmpty()){
            valid = false;
        }
        if(password.trim().isEmpty()){
            valid = false;
        }
        return valid;
    }
}
