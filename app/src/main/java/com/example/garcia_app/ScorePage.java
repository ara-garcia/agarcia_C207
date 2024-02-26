package com.example.garcia_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        TextView tv = findViewById(R.id.tv2);
        StoreScore ss = new StoreScore();
        tv.setText(Integer.toString(StoreScore.score));
    }
}