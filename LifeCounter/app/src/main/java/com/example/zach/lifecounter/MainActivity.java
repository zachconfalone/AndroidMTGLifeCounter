package com.example.zach.lifecounter;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int player1life = 20;
    int player2life = 20;
    int stormnum  = 0;
    int bluenum = 0;
    int rednum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button p1plus1 = (Button) findViewById(R.id.p1plus1);
        Button p1plus5 = (Button) findViewById(R.id.p1plus5);
        Button p1minus1 = (Button) findViewById(R.id.p1minus1);
        Button p1minus5 = (Button) findViewById(R.id.p1minus5);
        Button p2plus1 = (Button) findViewById(R.id.p2plus1);
        Button p2plus5 = (Button) findViewById(R.id.p2plus5);
        Button p2minus1 = (Button) findViewById(R.id.p2minus1);
        Button p2minus5 = (Button) findViewById(R.id.p2minus5);
        ImageButton Storm = (ImageButton) findViewById(R.id.StormImage);
        ImageButton Red = (ImageButton) findViewById(R.id.RedImage);
        ImageButton Blue = (ImageButton) findViewById(R.id.BlueImage);
        final TextView player1score = (TextView) findViewById(R.id.player1score);
        final TextView player2score = (TextView) findViewById(R.id.player2score);
        final TextView StormCounter = (TextView) findViewById(R.id.StormCounter);
        final TextView BlueMana = (TextView) findViewById(R.id.BlueMana);
        final TextView RedMana = (TextView) findViewById(R.id.RedMana);
        Button SReset = (Button) findViewById(R.id.StormReset);
        Button LReset = (Button) findViewById(R.id.LifeReset);
        ImageButton mR = (ImageButton) findViewById(R.id.MinusRed);
        ImageButton mB = (ImageButton) findViewById(R.id.MinusBlue);


        p1plus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player1life += 1;
                player1score.setText(String.valueOf(player1life));
            }
        });

        p1plus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player1life += 5;
                player1score.setText(String.valueOf(player1life));
            }
        });

        p1minus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player1life -= 1;
                player1score.setText(String.valueOf(player1life));
            }
        });

        p1minus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player1life -= 5;
                player1score.setText(String.valueOf(player1life));
            }
        });

        p2plus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player2life += 1;
                player2score.setText(String.valueOf(player2life));
            }
        });

        p2plus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player2life += 5;
                player2score.setText(String.valueOf(player2life));
            }
        });

        p2minus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player2life -= 1;
                player2score.setText(String.valueOf(player2life));
            }
        });

        p2minus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player2life -= 5;
                player2score.setText(String.valueOf(player2life));
            }
        });

        Storm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stormnum += 1;
                StormCounter.setText(String.valueOf(stormnum));
            }
        });

        Red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rednum += 1;
                RedMana.setText(String.valueOf(rednum));
            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bluenum +=1;
                BlueMana.setText(String.valueOf(bluenum));
            }
        });

        SReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stormnum = 0;
                bluenum = 0;
                rednum = 0;
                StormCounter.setText(String.valueOf(stormnum));
                RedMana.setText(String.valueOf(rednum));
                BlueMana.setText(String.valueOf(bluenum));
            }
        });

        LReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player1life = 20;
                player2life = 20;
                player1score.setText(String.valueOf(player1life));
                player2score.setText(String.valueOf(player2life));
            }
        });

        mR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rednum -=1;
                RedMana.setText(String.valueOf(rednum));
            }
        });

        mB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bluenum -=1;
                BlueMana.setText(String.valueOf(bluenum));
            }
        });



    }
}
