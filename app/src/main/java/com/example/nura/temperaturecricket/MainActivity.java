package com.example.nura.temperaturecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    EditText numberEd;
    Button btn;
    TextView finalText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        numberEd = findViewById(R.id.numberEd);
        btn = findViewById(R.id.btn);
        finalText = findViewById(R.id.finalText);
        finalText.setVisibility(View.GONE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberEd.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all the fields!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int a = Integer.parseInt(numberEd.getText().toString());
                    double b = a / 3.0 + 4;
                    String text = "The approximate temperature outside is " + b + " degress Celsius.";
                    finalText.setText(text);
                    finalText.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
