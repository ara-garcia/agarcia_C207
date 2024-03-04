package com.example.garcia_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        RadioGroup answerQ1 = findViewById(R.id.radioGroup2);
        Button submitQ1 = findViewById(R.id.submitQ2);

        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question1.this, "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonId = answerQ1.getCheckedRadioButtonId();
                if(selectedRadioButtonId != -1){
                    RadioButton selectRB = findViewById(selectedRadioButtonId);
                    if(selectRB.getText().toString().equals("Egg")){
                        Toast.makeText(Question1.this, "You've got the correct answer", Toast.LENGTH_SHORT).show();
                        StoreScore.score++;
                    }else {
                        Toast.makeText(Question1.this, "wrong answer", Toast.LENGTH_SHORT).show();

                    }
                    Toast.makeText(Question1.this, "Selected: " + selectRB.getText(), Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Question1.this, "No option selected", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(Question1.this, Question2.class);

                startActivity(intent);
            }
        });
    }
    public void clicker(View v){
        Intent i = new Intent(this, Question2.class);
        Toast.makeText(this, "Question 2 Started", Toast.LENGTH_SHORT).show();
        i.putExtra("name", "Arabela");
        startActivity(i);

    }
}