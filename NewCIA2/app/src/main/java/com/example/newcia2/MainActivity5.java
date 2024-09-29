package com.example.newcia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView sum1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        sum1 = (TextView)findViewById(R.id.textView10);

        Intent intent = getIntent();
        String sum = intent.getStringExtra(MainActivity3.EXTRA_TOT);
        sum1.setText(sum);

    }
}