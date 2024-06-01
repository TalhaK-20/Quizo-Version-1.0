package com.example.quizo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2_Video extends AppCompatActivity {

    Button btn_a, btn_b, btn_c, btn_d;
    LinearLayout llGetInfo;

    VideoView videoView;

    int score;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_video);

        llGetInfo = findViewById(R.id.llGetInfo);
        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);
        btn_c = findViewById(R.id.btn_c);
        btn_d = findViewById(R.id.btn_d);

        llGetInfo.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slogan_anim));

        videoView = findViewById(R.id.videoView); // Initialize VideoView
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.charles_oliveira); // Replace "your_video_file" with your actual video file name
        videoView.setVideoURI(videoUri);
        videoView.start();

        btn_a.setOnClickListener(v -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            score++;
            Intent i = new Intent(Activity2_Video.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
        btn_b.setOnClickListener(a -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            Intent i = new Intent(Activity2_Video.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
        btn_c.setOnClickListener(b -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            Intent i = new Intent(Activity2_Video.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
        btn_d.setOnClickListener(c -> {
            int score = getIntent().getIntExtra("score", 0); // Use getIntExtra for an integer value
            Intent i = new Intent(Activity2_Video.this, Final_Activity_Results.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
    }
}