package com.example.mileskmconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConMilesToKm = (Button) findViewById(R.id.buttonConvMilesToKm);
        buttonConMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vMiles = Double.parseDouble(textBoxMiles.getText().toString());
                double vKm = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));

            }
        });


        Button buttonConKmToMiles = (Button) findViewById(R.id.buttonConvKmToMiles);
        buttonConKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                double vKm = Double.parseDouble(textBoxKm.getText().toString());
                double vMiles = vKm*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));
            }
        });

    }
}
