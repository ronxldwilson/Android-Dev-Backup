package com.example.cia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button button5;
    Button button2;
    String[] Subject = { "Computer", "Mathematics", "Statistics"};
    String choice;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button)findViewById(R.id.button2);
        button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
            Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
            Intent intent3 = new Intent(MainActivity.this, MainActivity4.class);

            if(choice.equals("Computer")){
                startActivity(intent1);
            }
            else if(choice.equals("Mathematics")){
                Toast.makeText(getApplicationContext(), "Hello2", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
            }
            else{
                Toast.makeText(getApplicationContext(), "Hello3", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });

        button2.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show());

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

            ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, Subject);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);

    }
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
            Toast.makeText(getApplicationContext(),Subject[position] , Toast.LENGTH_LONG).show();
            choice =  Subject[position];
        }
        @Override
        public void onNothingSelected(AdapterView arg0) {
            // TODO Auto-generated method stub
        }

}