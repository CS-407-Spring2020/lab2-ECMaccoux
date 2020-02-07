package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {

        EditText myText = (EditText)findViewById(R.id.textInput);
        String str = myText.getText().toString();

        //Toast.makeText(MainActivity.this, myText.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(str);

    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}
