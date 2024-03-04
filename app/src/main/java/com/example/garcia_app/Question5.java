package com.example.garcia_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        RadioGroup answerQ5 = findViewById(R.id.radioGroup5);
        Button submitQ1 = findViewById(R.id.button5);

        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question5.this, "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonId = answerQ5.getCheckedRadioButtonId();
                if(selectedRadioButtonId != -1){
                    RadioButton selectRB = findViewById(selectedRadioButtonId);
                    if(selectRB.getText().toString().equals("Window")){
                        Toast.makeText(Question5.this, "You've got the correct answer", Toast.LENGTH_SHORT).show();
                        StoreScore.score++;
                    }else {
                        Toast.makeText(Question5.this, "wrong answer", Toast.LENGTH_SHORT).show();

                    }
                    Toast.makeText(Question5.this, "Selected: " + selectRB.getText(), Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Question5.this, "No option selected", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(Question5.this, ScorePage.class);

                startActivity(intent);
            }
        });
    }
    public void clicker(View v){
        Intent i = new Intent(this, ScorePage.class);
        i.putExtra("name", "Arabela");
        startActivity(i);

    }
}