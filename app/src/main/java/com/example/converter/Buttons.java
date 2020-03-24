package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buttons extends AppCompatActivity {

    Button btn_weight, btn_distance, btn_currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        btn_weight = (Button) findViewById(R.id.bgroung2Button1Id);
        btn_distance = (Button) findViewById(R.id.bgroung2Button2Id);
        btn_currency = (Button) findViewById(R.id.bgroung2Button3Id);

        btn_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buttons.this, Weight_conversion.class);
                startActivity(intent);
            }
        });
        btn_distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buttons.this, Distance_conversion.class);
                startActivity(intent);
            }
        });
        btn_currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buttons.this, currency_conversion.class);
                startActivity(intent);
            }
        });
    }
}
