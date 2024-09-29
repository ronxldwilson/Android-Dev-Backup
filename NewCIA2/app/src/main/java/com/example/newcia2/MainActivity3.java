package com.example.newcia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    int sum = 0;
    Button button;

    public static final String EXTRA_TOT = "com.example.pro5.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(sum);
                String str1 = "Total Bill =" + str;
                Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_SHORT).show();
                String send = str;
                Intent intent = new Intent(MainActivity3.this,MainActivity5.class);
                intent.putExtra(EXTRA_TOT,str);
                startActivity(intent);
            }
        });
    }

    public void onCheckBoxClick(View view) {
        sum = sum + 100;
    }
}