package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textResult = (TextView)findViewById(R.id.textResult);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textResult.setText("Hello " + str);
    }
}
