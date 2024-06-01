package com.example.quizo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2_CS extends AppCompatActivity {

    Button btn_a, btn_b, btn_c, btn_d;
    LinearLayout llGetInfo;

    int score;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_cs);

        llGetInfo = findViewById(R.id.llGetInfo);
        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);
        btn_c = findViewById(R.id.btn_c);
        btn_d = findViewById(R.id.btn_d);

        llGetInfo.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slogan_anim));

        btn_a.setOnClickListener(v -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            Intent i = new Intent(Activity2_CS.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
        btn_b.setOnClickListener(a -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            Intent i = new Intent(Activity2_CS.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
        btn_c.setOnClickListener(b -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            score++;
            Intent i = new Intent(Activity2_CS.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
        btn_d.setOnClickListener(c -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            Intent i = new Intent(Activity2_CS.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
    }
}
