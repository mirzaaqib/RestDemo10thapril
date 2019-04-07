package com.example.restdemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText et_name, et_email, et_mobile_no, et_password, et_renter_password;
    CheckBox cb_termcondition;
    Button bt_register;
    String name, email, mobile_no, password, repassword, termcondition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_name = findViewById(R.id.user_sname);
        et_email = findViewById(R.id.email_address);
        et_mobile_no = findViewById(R.id.mobile_no);
        et_password = findViewById(R.id.user_password);
        et_renter_password = findViewById(R.id.reenter_user_password);
        cb_termcondition = findViewById(R.id.termscondition);
        bt_register = findViewById(R.id.user_register);
        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = et_name.getText().toString().trim();
                email = et_email.getText().toString().trim();
                mobile_no = et_mobile_no.getText().toString().trim();
                password = et_password.getText().toString().trim();
                repassword = et_renter_password.getText().toString().trim();
                termcondition = cb_termcondition.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(name.equals("")){
                    Toast.makeText(RegisterActivity.this, "please fill the name", Toast.LENGTH_SHORT).show();
                }

                else if(email.equals("")||!email.matches(emailPattern) && email.length()>0){
                    Toast.makeText(RegisterActivity.this, "please enter valid email", Toast.LENGTH_SHORT).show();
                }
                else if(mobile_no.equals("")||!(mobile_no.length()==9)){
                    Toast.makeText(RegisterActivity.this, "Number must be 9 digit", Toast.LENGTH_SHORT).show();
                }
                else if(password.equals("")|| !(password.length() >=6)){

                    Toast.makeText(RegisterActivity.this, "Password must be six chracter", Toast.LENGTH_SHORT).show();

                }
                else if(repassword.equals("")||!repassword.matches(password)){
                    Toast.makeText(RegisterActivity.this, "password not matched", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(RegisterActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

            }
        });

    }

}
