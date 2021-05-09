package com.example.animationbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation animFadeIn, animFadeOut, animBlink, animZoomIn, animZoomOut, animRotate, animMove,
            animSlideUp, animSlideDown, animBounce, animSequential, animTogether;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button FadeIn = findViewById(R.id.fadeIn);
        TextView textFadeIn = findViewById(R.id.textFadeIn);

        Button FadeOut = findViewById(R.id.fadeOut);
        TextView textFadeOut = findViewById(R.id.textFadeOut);

        Button Blink = findViewById(R.id.blink);
        TextView textBlink = findViewById(R.id.textBlink);

        Button ZoomIn = findViewById(R.id.zoomIn);
        TextView textZoomIn = findViewById(R.id.textZoomIn);

        Button ZoomOut = findViewById(R.id.zoomOut);
        TextView textZoomOut = findViewById(R.id.textZoomOut);

        Button Rotate = findViewById(R.id.rotate);
        TextView textRotate = findViewById(R.id.textRotate);

        Button Move = findViewById(R.id.move);
        TextView textMove = findViewById(R.id.textMove);

        Button SlideUp = findViewById(R.id.slideUp);
        TextView textSlideUp = findViewById(R.id.textSlideUp);

        Button SlideDown = findViewById(R.id.slideDown);
        TextView textSlideDown = findViewById(R.id.textSlideDown);

        Button Bounce = findViewById(R.id.bounce);
        TextView textBounce = findViewById(R.id.textBounce);

        Button Sequential = findViewById(R.id.seq);
        TextView textSeq = findViewById(R.id.textSeq);

        Button Together = findViewById(R.id.tog);
        TextView textTog = findViewById(R.id.textTog);

        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);   //fade_in is the name of the xml file
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        animMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        animSequential = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
        animTogether = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);

        //Fade-in Animation
        FadeIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textFadeIn.setVisibility(View.VISIBLE);
                textFadeIn.startAnimation(animFadeIn);
            }
        });

        //Fade-Out Animation
        FadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textFadeOut.setVisibility(View.VISIBLE);
                textFadeOut.startAnimation(animFadeOut);
            }
        });

        //Blink Animation
        Blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textBlink.setVisibility(View.VISIBLE);
                textBlink.startAnimation(animBlink);
            }
        });

        //Zoom In Animation
        ZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZoomIn.setVisibility(View.VISIBLE);
                textZoomIn.startAnimation(animZoomIn);
            }
        });

        //Zoom out Animation
        ZoomOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textZoomOut.setVisibility(View.VISIBLE);
                textZoomOut.startAnimation(animZoomOut);
            }
        });

        Rotate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textRotate.setVisibility(View.VISIBLE);
                textRotate.startAnimation(animRotate);
            }
        });

        Move.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textMove.setVisibility(View.VISIBLE);
                textMove.startAnimation(animMove);
            }
        });

        SlideUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textSlideUp.setVisibility(View.VISIBLE);
                textSlideUp.startAnimation(animSlideUp);
            }
        });

        SlideDown.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textSlideDown.setVisibility(View.VISIBLE);
                textSlideDown.startAnimation(animSlideDown);
            }
        });

        Bounce.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textBounce.setVisibility(View.VISIBLE);
                textBounce.startAnimation(animBounce);
            }
        });

        Sequential.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textSeq.setVisibility(View.VISIBLE);
                textSeq.startAnimation(animSequential);
            }
        });

        Together.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textTog.setVisibility(View.VISIBLE);
                textTog.startAnimation(animSequential);
            }
        });
    }
}