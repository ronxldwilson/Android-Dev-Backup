package com.example.addnumbers;

 
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button CALCULATE;
    TextView sum;
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = sum.findViewById(R.id.sum);
        n1 = n1.findViewById(R.id.n1);
        n2 = n2.findViewById(R.id.n2);
        int s = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
        sum.setText("The Sum is"+ s);

    }

}