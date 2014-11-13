package com.example.l33534.signin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class register3_validation extends Activity {


    private EditText editTex;
    private EditText editText5;
    private EditText editText6;
    private Button button;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        editTex= (EditText) findViewById(R.id.editTex);
        editText5= (EditText) findViewById(R.id.editText5);
        editText6= (EditText) findViewById(R.id.editText6);
        button = (Button)  findViewById(R.id.button);


       button.setOnClickListener(new OnClickListener() {

           public void onClick(View v) {
               if (editTex.getText().toString().equals("")) {

                   AlertDialog alertDialog = new AlertDialog.Builder(register3_validation.this).create();
                   alertDialog.setTitle("oops!");
                   alertDialog.setMessage("Username field is empty");
                   alertDialog.setButton("Ok",
                           new DialogInterface.OnClickListener() {
                               public void onClick(DialogInterface dialog, int which) {
                                   //dismiss the dialog
                               }
                           });

                   alertDialog.show();
               } else if (editText5.getText().toString().equals("")) {

                   AlertDialog alertDialog = new AlertDialog.Builder(register3_validation.this).create();
                   alertDialog.setTitle("oops!");
                   alertDialog.setMessage("Password  field is empty");
                   alertDialog.setButton("Ok",
                           new DialogInterface.OnClickListener() {
                               public void onClick(DialogInterface dialog, int which) {
                                   //dismiss the dialog
                               }
                           });

                   alertDialog.show();
               } else if (editText6.getText().toString().equals("")) {

                   AlertDialog alertDialog = new AlertDialog.Builder(register3_validation.this).create();
                   alertDialog.setTitle("oops!");
                   alertDialog.setMessage("Confirm Password field is empty");
                   alertDialog.setButton("Ok",
                           new DialogInterface.OnClickListener() {
                               public void onClick(DialogInterface dialog, int which) {
                                   //dismiss the dialog
                               }
                           });

                   alertDialog.show();
               } else if (!editText5.equals (editText6)) {
                   AlertDialog alertDialog = new AlertDialog.Builder(register3_validation.this).create();
                   alertDialog.setTitle("oops!");
                   alertDialog.setMessage("Passwords do not match");
                   alertDialog.setButton("Ok",
                           new DialogInterface.OnClickListener() {
                               public void onClick(DialogInterface dialog, int which) {
                                   //dismiss the dialog
                               }
                           });
                   alertDialog.show();
               } else {
                   Intent i = new Intent(register3_validation.this, start.class);
                   startActivity(i);

               }

           }
       });
    }
}