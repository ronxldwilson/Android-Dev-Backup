package com.example.program09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//LAYOUT - WIFI _ CAMERA _ MUSI CPLAYER _ Progress dialog
public class MainActivity extends AppCompatActivity {
    Button camera,wifi,music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button wifi = findViewById(R.id.button1);
        Button camera = findViewById(R.id.button2);
        Button music = findViewById(R.id.button3);

        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i1);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i2);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(i3);
            }
        });
    }
}