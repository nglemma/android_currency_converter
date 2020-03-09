package com.example.currencyconveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public void submitter(View view)
    {
        int xchangerate =365;
        EditText InputValues = findViewById(R.id.InputValue);
        int ffinal= Integer.parseInt(InputValues.getText().toString());
        int nairaValue = ffinal*xchangerate;
        Toast.makeText(this,"$"+InputValues.getText().toString()+" is "+nairaValue+" naira",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
