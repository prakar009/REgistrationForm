package com.example.plogin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class OTP extends AppCompatActivity {

    EditText ot1,ot2,ot3,ot4;
    Button submit;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        ot1 = findViewById(R.id.ot1);
        ot2 = findViewById(R.id.ot2);
        ot3 = findViewById(R.id.ot3);
        ot4 = findViewById(R.id.ot4);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });







    }
}