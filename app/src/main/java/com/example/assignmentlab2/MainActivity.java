package com.example.assignmentlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt =  (EditText) findViewById(R.id.editText);
        String edTxts = txt.getText().toString();


        TextView textv = (TextView)findViewById(R.id.textView1);

        Button pMe = findViewById(R.id.PressMe);

        pMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textv.setText(edTxts);

                Toast.makeText(getApplicationContext(), "Label has been Updated", Toast.LENGTH_LONG).show();




            }
        });



    }
}