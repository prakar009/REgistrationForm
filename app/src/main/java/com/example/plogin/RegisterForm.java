package com.example.plogin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterForm extends AppCompatActivity {
    public static final String TAG = "TAG";
    ImageView iv_male,iv_female;
    EditText et_email,et_name,et_mobile;
    TextView tv_male,tv_female,tv1,tv2,tv3;
    Button button;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        iv_female = findViewById(R.id.iv_female);
        iv_male = findViewById(R.id.iv_male);
        tv_female = findViewById(R.id.tv_female);
        tv_male = findViewById(R.id.tv_male);
        et_email = findViewById(R.id.et_email);
        et_mobile = findViewById(R.id.et_mobile);
        et_name = findViewById(R.id.et_name);
        button = findViewById(R.id.submit);



        //NICK NAME, EMAIL MOBILE VALIDATION

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_name.length()==0){
                    Toast.makeText(RegisterForm.this, "Enter Name !", Toast.LENGTH_SHORT).show();
                }else if (et_email.length()==0){
                    Toast.makeText(RegisterForm.this, "Enter email", Toast.LENGTH_SHORT).show();
                } else if (et_mobile.length()==0 || et_mobile.length()<10) {
                    Toast.makeText(RegisterForm.this, "Enter 10 digit valid mobile number !", Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(new Intent(getApplicationContext(),Login.class));
                }


            }
        });

    }



    // TEXT AND BUTTON COLOR CHANGES BY CLICKING

    //FOR MALE
    @SuppressLint("ResourceAsColor")
    public void maleIcon(View view) {
        iv_male.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
        iv_female.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
        tv_male.setTextColor(getResources().getColor(R.color.red));
        tv_female.setTextColor(getResources().getColor(R.color.black));
    }
    //FOR FEMALE
    @SuppressLint("ResourceAsColor")
    public void femaleClick(View view) {
        iv_female.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
        iv_male.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
        tv_female.setTextColor(getResources().getColor(R.color.red));
        tv_male.setTextColor(getResources().getColor(R.color.black));

    }
}