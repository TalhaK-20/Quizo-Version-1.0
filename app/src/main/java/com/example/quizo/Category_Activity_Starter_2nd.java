package com.example.quizo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Category_Activity_Starter_2nd extends AppCompatActivity {

    Button btn_a, btn_b;
    LinearLayout llGetInfo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_activity_starter_2nd);

        llGetInfo = findViewById(R.id.llGetInfo);
        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);

        llGetInfo.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slogan_anim));

        btn_a.setOnClickListener(v -> {
            Intent i = new Intent(Category_Activity_Starter_2nd.this, Activity1_CS.class);
            startActivity(i);
            finish();
        });
        btn_b.setOnClickListener(a -> {
            Intent i = new Intent(Category_Activity_Starter_2nd.this, Activity1_Video.class);
            startActivity(i);
            finish();
        });
}
}