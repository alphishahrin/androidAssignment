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

public class Weight_conversion extends AppCompatActivity {

    EditText edittext;
    RadioGroup group;
    RadioButton g2o, g2p, g2t, p2t, p2o;
    Button convert, clear;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_conversion);

        edittext = (EditText) findViewById(R.id.weightEditTextId);
        group = (RadioGroup) findViewById(R.id.weightRadioGroupId);
        g2o = (RadioButton) findViewById(R.id.GramsToOuncesId);
        g2p = (RadioButton) findViewById(R.id.GramsToPoundsId);
        g2t = (RadioButton) findViewById(R.id.GramsToTonsId);
        p2t = (RadioButton) findViewById(R.id.PoundsToTonsId);
        p2o = (RadioButton) findViewById(R.id.PoundsToOunces);
        convert = (Button) findViewById(R.id.weiConvertId);
        clear = (Button) findViewById(R.id.weiClearId);
        textView = (TextView) findViewById(R.id.weightResultId);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.weiClearId)
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

                    if (selected == R.id.weiConvertId) {
                        edittext.setText("");
                    }
                    if (selected == R.id.GramsToOuncesId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 0.0353;
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.GramsToPoundsId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 0.00220462;
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.GramsToTonsId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 1.102 * Math.pow(10, -6);
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.PoundsToTonsId) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 0.0005;
                        textView.setText("" + value2);
                    }
                    if (selected == R.id.PoundsToOunces) {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 16;
                        textView.setText("" + value2);
                    }
                } catch (Exception e) {
                    Toast.makeText(Weight_conversion.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
