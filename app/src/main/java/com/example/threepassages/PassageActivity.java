package com.example.threepassages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//TODO: FIX PASSAGE ACTIVITY TAG TO LAUNCH IT CORRECTLY IN MANI.XML
public class PassageActivity extends AppCompatActivity {
    private TextView passage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);
        Intent intent = getIntent();
        passage = findViewById(R.id.passageDisplay);
        String p = intent.getStringExtra(MainActivity.EXTRA_PASSAGE);
        passage.setText(p);
    }
}