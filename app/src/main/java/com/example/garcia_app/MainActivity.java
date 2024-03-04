package com.example.garcia_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clicker(View v){
        Intent i = new Intent(MainActivity.this, Question1.class);
        Toast.makeText(this, "Question 1 Started", Toast.LENGTH_SHORT).show();
        i.putExtra("name", "Arabela");
        startActivity(i);

        }
    }
