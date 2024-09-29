package com.example.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button1;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = findViewById(R.id.loginSubmitButton);
        username = findViewById(R.id.loginUsername);
        password = findViewById(R.id.loginPassword);
        String Mail="ronwilson0001@gmail.com";
        String Pass="123";

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((username.getText().toString()).equals(Mail) && (password.getText().toString()).equals(Pass))
                {
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity2.this , "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}