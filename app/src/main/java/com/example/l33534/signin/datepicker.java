package com.example.l33534.signin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class datepicker extends Activity {

    private DatePicker pickerDate;
    private TextView info;
    private Button button1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        info = (TextView) findViewById(R.id.info);
        pickerDate = (DatePicker) findViewById(R.id.pickerdate);
        button1 = (Button)  findViewById(R.id.button1);

        Calendar today = Calendar.getInstance();

        pickerDate.init(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                today.get(Calendar.DAY_OF_MONTH),
                new OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view,
                                              int year, int monthOfYear, int dayOfMonth) {
                        Toast.makeText(getApplicationContext(),
                                "DateChanged", Toast.LENGTH_SHORT).show();
                        info.setText(
                                "Your birthdate is on " + dayOfMonth + " - " + monthOfYear +
                                        " - " + year);

                    }
                });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(datepicker.this, register3_validation.class);
                startActivity(i);
            }
        });


            }
        }