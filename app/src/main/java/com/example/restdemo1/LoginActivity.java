package com.example.restdemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    EditText et_username, et_Password;
    String username, password;
    Button btn_login;
    TextView tv_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_username = findViewById(R.id.username);
        et_Password = findViewById(R.id.password);
        tv_signup = findViewById(R.id.signup);
        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login = findViewById(R.id.login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = et_username.getText().toString().trim();
                password = et_Password.getText().toString().trim();

                if(username.equals("a") && password.equals("a"))
                {
                    Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }

                else if(username.equals("")){

                    Toast.makeText(LoginActivity.this, "Please enter the username", Toast.LENGTH_SHORT).show();

                }
                else if(password.equals("")){

                    Toast.makeText(LoginActivity.this, "Please enter the password", Toast.LENGTH_SHORT).show();

                }

                else
                {

                    Toast.makeText(LoginActivity.this, "Username and Password not matched", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
