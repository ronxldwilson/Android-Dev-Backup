package com.example.program03;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button log,sig;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log=(Button)findViewById(R.id.login);
        sig=(Button)findViewById(R.id.signin);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v01){
                String un=user.getText().toString();
                String pw=pass.getText().toString();
                if(un.equals("Peter")){
                    if(pw.equals("parker")){
                        Toast.makeText(getApplicationContext(),"Welcome "+un,
                                Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Invalid Password, "+un+"!",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid User!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        sig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v02) {
                Toast.makeText(getApplicationContext(),"Loading Sign Up page...",
                        Toast.LENGTH_SHORT).show();
                Intent Sign_In=new Intent(getApplicationContext(),SignInActivity.class);
                startActivity(Sign_In);
            }
        });
    }
}