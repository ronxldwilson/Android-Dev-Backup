package com.example.newprociaone;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button twoWheelerButton;
    Button fourWheelerButton;
    Button rfidButton;
    Button truckButton;
    Button vipButton;

    TextView vehicleCount;
    TextView totalAmount;

    private final int twoWheelerCost = 10;
    private final int fourWheelerCost = 20;
    private final int truckCost = 40;
    private final int vipCost = 0;
    private final int rfidCost = 50;

    private int totalCost= 0;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicleCount = (TextView)findViewById(R.id.vehicleCount);
        totalAmount = (TextView)findViewById(R.id.totalAmount);

        twoWheelerButton = (Button)findViewById(R.id.twoWheelerButton);
        fourWheelerButton = (Button) findViewById(R.id.fourWheelerButton);
        rfidButton = (Button) findViewById(R.id.rfidButton);
        truckButton = (Button) findViewById(R.id.truckButton);
        vipButton = (Button) findViewById(R.id.vipButton);

        twoWheelerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, counter, Toast.LENGTH_SHORT).show();
                counter++;
                totalCost= totalCost+ twoWheelerCost;

                totalAmount.setText(Integer.toString(totalCost));
                vehicleCount.setText(Integer.toString(counter));

            }
        });
        fourWheelerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalCost= totalCost+fourWheelerCost;
                Update();
            }
        });
        rfidButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalCost= totalCost+rfidCost;
                Update();
            }
        }));
        truckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalCost= totalCost+truckCost;
                Update();
            }
        });

        vipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalCost= totalCost+vipCost;
                Update();
            }
        });
    }

    private void Update() {
        counter++;
        totalAmount.setText(Integer.toString(totalCost));
        vehicleCount.setText(Integer.toString(counter));
    }
}