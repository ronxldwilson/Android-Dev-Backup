package com.example.newcia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button button;
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String str = String.valueOf(sum);
            String str1 = "Total Bill =" + str;
            Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
            startActivity(intent);
        }
    });
}

    public void onCheckBoxClick(View view) {
        sum = sum + 100;
    }
}
