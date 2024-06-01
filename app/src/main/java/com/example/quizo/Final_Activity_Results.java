package com.example.quizo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Final_Activity_Results extends AppCompatActivity {

    TextView tv_result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_activity_results);

        tv_result = findViewById(R.id.tv_result);

        int result = getIntent().getIntExtra("score", 0);
        tv_result.setText(String.valueOf(result));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Final_Activity_Results.this, Category_Activity_Starter_2nd.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
