package com.example.assignment21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
        TextView t1;
        EditText t2;
        EditText t3;
        EditText t4;
        Button btn;
        ToggleButton ttb;
        CheckBox c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.t1);
        //t1.setText("New Text");
        String value = t1.getText().toString().trim();
        Toast.makeText(this, "value", Toast.LENGTH_SHORT).show();

        t2 = findViewById(R.id.t2);
        String Valu = t2.getText().toString();
        Toast.makeText(this, "value", Toast.LENGTH_SHORT).show();

        t3 = findViewById(R.id.t3);
        String val = t3.getText().toString();
        Toast.makeText(this, "value", Toast.LENGTH_SHORT).show();

        t4 = findViewById(R.id.t4);
        String Va = t4.getText().toString();
        Toast.makeText(this, "value", Toast.LENGTH_SHORT).show();



        c1 = findViewById(R.id.a);
        c2 = findViewById(R.id.b);
        c3 = findViewById(R.id.c);
    }
    public void ButtonClicked(View v){
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
    }
    public void ToggleChecked(View v){
        ttb = findViewById(R.id.tt);
        if (ttb.isChecked()){
            ttb.getTextOn ();
            Toast.makeText(this, "Button On", Toast.LENGTH_SHORT).show();
        }
        else {
            ttb.getTextOff();
            Toast.makeText(this, "Button OFF", Toast.LENGTH_SHORT).show();
        }
    }
    public void GetValues(View v){
        StringBuilder builder = new StringBuilder();
        if (c1.isChecked()){
            String value1 = c1.getText().toString();
            builder.append(value1);
        }
        if (c2.isChecked()){
            String value2 = c2.getText().toString();
            builder.append("\n"+value2);
        }
        if (c3.isChecked()){
            String value3 = c3.getText().toString();
            builder.append("\n"+value3);
        }
        Toast.makeText(this, builder, Toast.LENGTH_SHORT).show();
    }
}