package com.example.oneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.reddit.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.canva.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.notion.so"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.open.spotify.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gaana.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.in"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.flipkart.com"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hotstar.com/in/disneyplus"));
                Intent chooser = Intent.createChooser(browserIntent, "Choose Your Browser");
                if (browserIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(chooser);
            }
        });


    }
}