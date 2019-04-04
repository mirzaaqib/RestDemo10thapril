package com.example.restdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AllMenuActivity extends AppCompatActivity {
    ImageView foodimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_menu);
        foodimage = findViewById(R.id.foodimage);
        foodimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllMenuActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
