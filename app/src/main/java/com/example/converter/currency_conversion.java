package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class currency_conversion extends AppCompatActivity {

    EditText edittext;
    RadioGroup group;
    RadioButton d2t, r2t, p2t, r2d, r2p;
    Button convert, clear;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_conversion);

        edittext = (EditText) findViewById(R.id.currencyEditTextId);
        group = (RadioGroup) findViewById(R.id.currencyRadioGroupId);
        d2t = (RadioButton) findViewById(R.id.DollarToTakaId);
        r2t = (RadioButton) findViewById(R.id.RupeeToTakaId);
        p2t = (RadioButton) findViewById(R.id.PoundToTakaId);
        r2d = (RadioButton) findViewById(R.id.RupeeToDollarId);
        r2p = (RadioButton) findViewById(R.id.RupeeToPoundId);
        convert = (Button) findViewById(R.id.curConvertId);
        clear = (Button) findViewById(R.id.curClearId);
        textView = (TextView) findViewById(R.id.currencyResultId);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.curClearId)
                {
                    edittext.setText("");
                }
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int selected = group.getCheckedRadioButtonId();
                    convert = (RadioButton) findViewById(selected);
                    String value = convert.getText().toString();

                    if (selected == R.id.curConvertId) {
                        edittext.setText("");
                    }
                    if (selected == R.id.DollarToTakaId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 85.09;
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.RupeeToTakaId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 1.12;
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.PoundToTakaId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 100;
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.RupeeToDollarId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 0.013;
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.RupeeToPoundId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 0.011;
                        textView.setText("" + value2);
                    }
                } catch (Exception e) {
                    Toast.makeText(currency_conversion.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

