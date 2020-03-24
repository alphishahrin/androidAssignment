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

import java.security.acl.Group;

public class Distance_conversion extends AppCompatActivity {

    EditText edittext;
    RadioGroup group;
    RadioButton metre2m, metre2f, metre2i, mile2f, mile2i;
    Button convert, clear;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_conversion);

        edittext = (EditText) findViewById(R.id.distanceEditTextId);
        group = (RadioGroup) findViewById(R.id.distanceRadioGroupId);
        metre2m = (RadioButton) findViewById(R.id.MeterToMileId);
        metre2f = (RadioButton) findViewById(R.id.MeterToFootId);
        metre2i = (RadioButton) findViewById(R.id.MeterToInchId);
        mile2f = (RadioButton) findViewById(R.id.MileToFootId);
        mile2i = (RadioButton) findViewById(R.id.MileToInchId);
        convert = (Button) findViewById(R.id.disConvertId);
        clear = (Button) findViewById(R.id.disClearId);
        textView = (TextView) findViewById(R.id.distanceResultId);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.disClearId)
                {
                    edittext.setText("");
                }
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int selected = group.getCheckedRadioButtonId();
                    convert = (RadioButton) findViewById(selected);
                    String value = convert.getText().toString();

                    if(selected == R.id.disConvertId)
                    {
                        edittext.setText("");
                    }
                    if(selected == R.id.MeterToMileId)
                    {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 0.000621;
                        textView.setText(""+value2);
                    }
                    if(selected == R.id.MeterToFootId)
                    {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 3.28084;
                        textView.setText(""+value2);
                    }
                    if(selected == R.id.MeterToInchId)
                    {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 39.3701;
                        textView.setText(""+value2);
                    }
                    if(selected == R.id.MileToFootId)
                    {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 5280;
                        textView.setText(""+value2);
                    }
                    if(selected == R.id.MileToInchId)
                    {
                        String value1 = edittext.getText().toString();
                        Double value2 = Double.parseDouble(value1);
                        value2 = value2 * 63360;
                        textView.setText(""+value2);
                    }
                }catch (Exception e)
                {
                    Toast.makeText(Distance_conversion.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
