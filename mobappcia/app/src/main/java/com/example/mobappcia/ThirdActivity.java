package com.example.mobappcia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    EditText n,list;
    String abs[]=new String[10];
    int num=0;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        n=findViewById(R.id.n);
        list=findViewById(R.id.list);
        logout=findViewById(R.id.logout);
        //Intent i=getIntent();
        //String[] abs=i.getStringArrayExtra("abs");
        Bundle extras=getIntent().getExtras();
        abs[10]=extras.getString("abs");
        for(int j=0;j<=10;j++){
            if(abs[j]!=""){
                num++;
            }
            else{
                break;
            }
        }
        n.setText(num);
        String abs02="";
        for(int k=0;k<=num;k++){
            abs02+=" "+abs[k];
        }
        list.setText(abs02);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdActivity.this.finishAffinity();
            }
        });
    }
}