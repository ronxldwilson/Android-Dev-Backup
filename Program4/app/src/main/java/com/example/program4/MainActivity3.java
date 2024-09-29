package com.example.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        image1 = findViewById(R.id.imageView3);
        image2 = findViewById(R.id.imageView4);
        image3 = findViewById(R.id.imageView5);
        image4 = findViewById(R.id.imageView6);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://newtreat.co.in"));
                startActivity(intent1);
            }
        });


        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8359838126"));
                startActivity(intent2);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.935546111560111, 77.60614584602457"));
                startActivity(intent3);
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,"ronald.wilson@science.christuniversity.in");
                email.putExtra(Intent.EXTRA_SUBJECT,"Greetings from my app");
                email.putExtra(Intent.EXTRA_TEXT,"Good Morning !, This is a test email sent through the APP");
                email.setType("message/rfc882");
                startActivity(email);
            }
        });

    }
}