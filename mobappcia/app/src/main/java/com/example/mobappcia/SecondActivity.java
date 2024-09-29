package com.example.mobappcia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
    Button submit;
    int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        cb1=findViewById(R.id.checkBox);
        cb2=findViewById(R.id.checkBox2);
        cb3=findViewById(R.id.checkBox3);
        cb4=findViewById(R.id.checkBox4);
        cb5=findViewById(R.id.checkBox5);
        cb6=findViewById(R.id.checkBox6);
        cb7=findViewById(R.id.checkBox7);
        cb8=findViewById(R.id.checkBox8);
        cb9=findViewById(R.id.checkBox9);
        cb10=findViewById(R.id.checkBox10);
        String abs[]=new String[10];
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb1.isChecked()!=true){
                    abs[x]=cb1.getText().toString();
                    x=x+1;
                }
                if(cb2.isChecked()!=true){
                    abs[x]=cb2.getText().toString();
                    x++;
                }
                if(cb3.isChecked()!=true){
                    abs[x]=cb3.getText().toString();
                    x++;
                }
                if(cb4.isChecked()!=true){
                    abs[x]=cb4.getText().toString();
                    x++;
                }
                if(cb5.isChecked()!=true){
                    abs[x]=cb5.getText().toString();
                    x++;
                }
                if(cb6.isChecked()!=true){
                    abs[x]=cb6.getText().toString();
                    x++;
                }
                if(cb7.isChecked()!=true){
                    abs[x]=cb7.getText().toString();
                    x++;
                }
                if(cb8.isChecked()!=true){
                    abs[x]=cb8.getText().toString();
                    x++;
                }
                if(cb9.isChecked()!=true){
                    abs[x]=cb9.getText().toString();
                    x++;
                }
                if(cb10.isChecked()!=true){
                    abs[x]=cb10.getText().toString();
                    x++;
                }
                Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
                i.putExtra("abs",abs);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Submitting...",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}