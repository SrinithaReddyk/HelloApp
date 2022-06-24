package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student s = new student("srinitha", 21, 2091);
    }


    public void handleClick(View view) {
        Toast.makeText(this, "Button Clicked ", Toast.LENGTH_SHORT).show();
    }
}