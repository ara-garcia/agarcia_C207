package com.example.garcia_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        RadioGroup answerQ3 = findViewById(R.id.radioGroup4);
        Button submitQ1 = findViewById(R.id.button3);
        StoreScore.score++;
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question3.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonId = answerQ3.getCheckedRadioButtonId();
                if(selectedRadioButtonId != -1){
                    RadioButton selectRB = findViewById(selectedRadioButtonId);
                    if(selectRB.getText().toString().equals("Future")){
                        Toast.makeText(Question3.this, "You've got the correct answer", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question3.this, Question4.class);

                        startActivity(intent);

                    }else {
                        Toast.makeText(Question3.this, "wrong answer", Toast.LENGTH_SHORT).show();

                    }
                    Toast.makeText(Question3.this, "Selected: " + selectRB.getText(), Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Question3.this, "No option selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void clicker(View v){
        Intent i = new Intent(this, Question4.class);
        Toast.makeText(this, "Question 4 Started", Toast.LENGTH_SHORT).show();
        i.putExtra("name", "Arabela");
        startActivity(i);

    }
}