package com.example.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button  button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                
            }
        });
    }
}

//
//    Create an Application that has a minimum of two activities
//    one to display the login screen  (you can use the previous LAB Program)
//- accept the username and password
//        - on successful login display the second activity
//        On second activity display 4 image buttons
////        - First Button for showing the company website "http://newtreat.co.in;
//        - Second button for making a direct phone call
//        - Third button to show the location - location must be CHRIST University - Central Campus
//        - Forth button to send an email with the below details
//        The subject of the email - "Greetings from 5BCA!!"
//        Send to: any two emails
//        email content: "Good Morning !, This is a test email sent through the APP"
//
//        Use appropriate font, style, theme, button, image button, radio button, checkbox (as needed)
//        Use proper Intent to complete the app
//        You can choose any layout which suits the need of the APP
//        Upload the Manifest code, Layout XML code and Java code, in Word/Docs/PDF format along with the Project ZIP file