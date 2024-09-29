package com.example.mobappcia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("teacher@university.in")&&
                        password.getText().toString().equals("vinaysir")){
                    Toast.makeText(getApplicationContext(),"Redirecting...",
                            Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong credentials!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}