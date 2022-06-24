package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.etPersonname);
        student s = new student("srinitha", 21, 2091);
    }


    public void handleClick(View view) {
        Toast.makeText(this, "Button Clicked ", Toast.LENGTH_SHORT).show();
        String name = nameEditText.getText().toString();
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(hIntent);
        
        
    }
}