package com.lhj.physicsbasedanimationdemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button,button2;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_in);
        initView();
        initListeners();
    }

    private void initListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TranActivity.class);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, findViewById(R.id.imageView2), "share");
                startActivity(intent, transitionActivityOptions.toBundle());
            }
        });
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        textview = (TextView) findViewById(R.id.textview);
    }

    private void initFlingAnim(){
//        FlingAnimation flingAnimation = new FlingAnimation(img, DynamicAnimation.X);
//        flingAnimation.setStartVelocity(500f);
//        flingAnimation.setFriction(0.5f);
//        flingAnimation.start();
    }

    private void initSpringAnim(){
//        SpringAnimation springAnimation = new SpringAnimation(img, DynamicAnimation.X);
//        springAnimation.setStartVelocity(2000);
//        SpringForce springForce = new SpringForce();
//        springForce.setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY);
//        springForce.setStiffness(SpringForce.STIFFNESS_LOW);
//        springForce.setFinalPosition(img.getX());
//        springAnimation.setSpring(springForce);
//        springAnimation.start();
    }

}
