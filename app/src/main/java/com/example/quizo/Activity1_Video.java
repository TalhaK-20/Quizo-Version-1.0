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

public class Activity1_Video extends AppCompatActivity {

    Button btn_a, btn_b, btn_c, btn_d;
    LinearLayout llGetInfo;

    VideoView videoView, videoViewBackground;
    int score = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_video);

        llGetInfo = findViewById(R.id.llGetInfo);
        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);
        btn_c = findViewById(R.id.btn_c);
        btn_d = findViewById(R.id.btn_d);

        videoViewBackground  = findViewById(R.id.videoViewBackground);
        videoViewBackground.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cold_huh));
        videoViewBackground.start();

        videoView = findViewById(R.id.videoView1st); // Initialize VideoView
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cold_huh); // Replace "your_video_file" with your actual video file name
        videoView.setVideoURI(videoUri);
        videoView.start();

        llGetInfo.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slogan_anim));

        btn_a.setOnClickListener(v -> {
            Intent i = new Intent(Activity1_Video.this, Activity2_Video.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });

        btn_b.setOnClickListener(a -> {
            Intent i = new Intent(Activity1_Video.this, Activity2_Video.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });

        btn_c.setOnClickListener(b -> {
            Intent i = new Intent(Activity1_Video.this, Activity2_Video.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });

        btn_d.setOnClickListener(c -> {
            score++;
            Intent i = new Intent(Activity1_Video.this, Activity2_Video.class);
            i.putExtra("score", score);
            startActivity(i);
            finish();
        });
    }
}