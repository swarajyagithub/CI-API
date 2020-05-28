package com.example.myapplicationsignup;


import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.regex.Pattern;
import android.util.Patterns;


public class MainActivity extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN =

            Pattern.compile("^" +
                    "(?=.*[a-zA-Z])" +
                    ".{4,}" +
                    "$");


    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;

    Button btn_signUp1;
    Button btn_login1;
    private Object Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);
        btn_login1= (Button) findViewById(R.id.login);
        btn_signUp1=(Button) findViewById(R.id.signUp);

        btn_signUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SignUp.class);
                startActivity(i);
            }
        });


        btn_login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwordInput = textInputPassword.getEditText().getText().toString();

                String emailInput = textInputEmail.getEditText().getText().toString();
                if (emailInput.isEmpty()) {
                    textInputEmail.setError("Field can't be empty.");

                } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
                    textInputEmail.setError("Please verify email.");

                } else if (passwordInput.isEmpty()) {
                    textInputPassword.setError("Field can't be empty");

                } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
                    textInputPassword.setError("Please verify password.Password too weak");

                } else {
                    Intent in = new Intent(MainActivity.this, welcome.class);
                    startActivity(in);
                }

            }
        });

    }
}


