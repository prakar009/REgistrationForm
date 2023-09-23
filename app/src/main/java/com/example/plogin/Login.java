package com.example.plogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    TextView Name, Mobile, Email, Country;
    Button Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = findViewById(R.id.name);
        Mobile = findViewById(R.id.mobile);
        Email = findViewById(R.id.email);
        Button = findViewById(R.id.submit);

        //LOGIN BUTTON
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.length()==0){
                    Toast.makeText(Login.this, "Enter name", Toast.LENGTH_SHORT).show();
                } else if (Mobile.length()==0 || Mobile.length()<10) {
                    Toast.makeText(Login.this, "Enter 10 digit valid mobile number", Toast.LENGTH_SHORT).show();

                } else if (Email.length()==0) {
                    Toast.makeText(Login.this, "Enter email", Toast.LENGTH_SHORT).show();

                }else {
                    startActivity(new Intent(getApplicationContext(), OTP.class));
                }
            }

        });

        //NICK NAME, EMAIL MOBILE VALIDATION




    }
}