package com.example.cia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    //Computer
    Button submit;
    private RadioGroup radioGroup;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button submit = (Button)findViewById(R.id.button);

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radio1);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radio2);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radio3);

        radioGroup1.clearCheck();

        radioGroup1.setOnCheckedChangeListener((group, checkedId) -> {
            // Get the selected Radio Button
            RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
        });

        radioGroup2.clearCheck();

        radioGroup2.setOnCheckedChangeListener((group, checkedId) -> {
            // Get the selected Radio Button
            RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
        });

        radioGroup3.clearCheck();

        radioGroup3.setOnCheckedChangeListener((group, checkedId) -> {
            // Get the selected Radio Button
            RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
        });

        // Add the Listener to the Submit Button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(MainActivity3.this,"No answer has been selected",Toast.LENGTH_SHORT).show();
                }
                else {
                    RadioButton radioButton1 = (RadioButton) radioGroup1.findViewById(R.id.radioButton2);
                    RadioButton radioButton2 = (RadioButton) radioGroup2.findViewById(R.id.radioButton4);
                    RadioButton radioButton3 = (RadioButton) radioGroup3.findViewById(R.id.radioButton6);
                    // Now display the value of selected item
                    // by the Toast message
                    if(radioButton1.getText().toString().equals("True")){
                        total++;
                    }
                    if(radioButton2.getText().toString().equals("True")){
                        total++;
                    }
                    if(radioButton3.getText().toString().equals("True")){
                        total++;
                    }
//                    Toast.makeText(MainActivity2.this,radioButton1.getText(),Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity3.this, total, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}