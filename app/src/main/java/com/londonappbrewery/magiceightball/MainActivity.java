package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball = (ImageView) findViewById(R.id.image_eightBall);
        Button button = (Button) findViewById(R.id.button_ask);
        final int balls[] = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        button.setOnClickListener(new View.OnClickListener() {

            Random r = new Random();
            int nextBall;

            @Override
            public void onClick(View view) {

                nextBall = r.nextInt(5);
                ball.setImageResource(balls[nextBall]);
            }
        });
    }
}
