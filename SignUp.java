package com.example.myapplicationsignup;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN =

            Pattern.compile("^" +
                    "(?=.*[a-zA-Z])" +
                    ".{4,}" +
                    "$");


    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    private TextInputLayout textInputConfirm;
    Button btn_signUp;
    private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btn_signUp = (Button) findViewById(R.id.signUp);
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);
        textInputConfirm=findViewById(R.id.text_con_password);
        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwordInput = textInputPassword.getEditText().getText().toString();
                String emailInput = textInputEmail.getEditText().getText().toString();
                String conInput=textInputConfirm.getEditText().getText().toString();
                if (emailInput.isEmpty()) {
                    textInputEmail.setError("Field can't be empty.");

                } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
                    textInputEmail.setError("Please verify email.");

                } else if (passwordInput.isEmpty()) {
                    textInputPassword.setError("Field can't be empty");

                } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
                    textInputPassword.setError("Please verify password. Password too weak.");

                } else if(passwordInput.equals(conInput)) {
                    Intent in = new Intent(SignUp.this, welcome.class);
                    startActivity(in);
                }
                else{
                    textInputConfirm.setError("Password dosen't match");
                }
            }
        });
    }
}
