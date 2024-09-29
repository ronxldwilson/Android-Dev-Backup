package com.example.program11;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button enablebutton , disablebutton;
    @Override
    protected void onCreate (Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_main);
        enablebutton = findViewById (R.id.button);
        disablebutton = findViewById (R.id.button2);
        enablebutton.setOnClickListener(view -> {
            WifiManager wifi =  (WifiManager)(getSystemService(Context.WIFI_SERVICE));
            wifi.setWifiEnabled(true);
        });
        disablebutton.setOnClickListener(view -> {
            WifiManager wifi = (WifiManager)(getSystemService(Context.WIFI_SERVICE));
            wifi.setWifiEnabled(false);
        });
    }
}