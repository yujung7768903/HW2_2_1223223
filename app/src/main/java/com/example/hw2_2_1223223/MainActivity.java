package com.example.hw2_2_1223223;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.Matrix;

public class MainActivity extends AppCompatActivity {
    Button rotateButton;
    Button initializeButton;
    ImageView rotateImage;
    int mDegree = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotateButton = (Button) findViewById(R.id.rotate_button);
        initializeButton = (Button) findViewById(R.id.initialize_button);
        rotateImage = (ImageView) findViewById(R.id.rotate_image);

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotation(mDegree + 10);
            }
        });

        initializeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotation(0);
            }
        });
    }

    public void rotation(int d) {
        RotateAnimation ra = new RotateAnimation(mDegree, d, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        ra.setDuration(200);
        ra.setFillAfter(true);
        rotateImage.startAnimation(ra);
        mDegree = d;
    }
}