package com.example.l33534.signin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by L33534 on 10/9/2014.
 */
public class particulars extends Activity {

    private EditText emailEditText;
    private EditText editText;
    private EditText editText2;
    private EditText editText4;
    private EditText editText3;
    private Button btnRegister;
    private android.widget.LinearLayout LinearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        emailEditText = (EditText) findViewById(R.id.emailEditText);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        btnRegister = (Button)  findViewById(R.id.btnRegister);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("")) {
                    AlertDialog ad = new AlertDialog.Builder(particulars.this).create();
                    ad.setCancelable(false); // This blocks the 'BACK' button
                    ad.setTitle("oops!");
                    ad.setMessage("First name field is empty");
                    ad.setButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    ad.show();
                } else if (editText2.getText().toString().equals("")) {
                    AlertDialog ad = new AlertDialog.Builder(particulars.this).create();
                    ad.setCancelable(false); // This blocks the 'BACK' button
                    ad.setTitle("oops!");
                    ad.setMessage("Last name field is empty");
                    ad.setButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    ad.show();
                } else if (editText4.getText().toString().equals("")) {
                    AlertDialog ad = new AlertDialog.Builder(particulars.this).create();
                    ad.setCancelable(false); // This blocks the 'BACK' button
                    ad.setTitle("oops!");
                    ad.setMessage("Address field is empty");
                    ad.setButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    ad.show();
                } else if (emailEditText.getText().toString().equals("")) {
                    AlertDialog ad = new AlertDialog.Builder(particulars.this).create();
                    ad.setCancelable(false); // This blocks the 'BACK' button
                    ad.setTitle("oops!");
                    ad.setMessage("Email is empty");
                    ad.setButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    ad.show();

                } else if (editText3.getText().toString().equals("")) {
                    AlertDialog ad = new AlertDialog.Builder(particulars.this).create();
                    ad.setCancelable(false); // This blocks the 'BACK' button
                    ad.setTitle("oops!");
                    ad.setMessage("Phone Number is empty");
                    ad.setButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    ad.show();
                } else {

                    Intent i = new Intent(particulars.this, datepicker.class);
                    startActivity(i);
                    //TabWidget.getInstance().getTabHost().setCurrentTab(3);
                }
            }

        });

    }

}
