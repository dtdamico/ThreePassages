package com.example.threepassages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_PASSAGE = "com.example.android.threepassages.extra.PASSAGE";
    private static final String PASSAGE1 = "Never Gonna Give You Up";
    private static final String PASSAGE2 = "Never Gonna Let You Down";
    private static final String PASSAGE3 = "Never Gonna Run Around And Desert You";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPassage1(View view) {
        launchPassage(PASSAGE1);
    }

    public void launchPassage2(View view) {
        launchPassage(PASSAGE2);
    }

    public void launchPassage3(View view) {
        launchPassage(PASSAGE3);
    }

    public void launchPassage(String value) {
        Intent intent = new Intent(this, PassageActivity.class);
        intent.putExtra(EXTRA_PASSAGE, value);
        startActivity(intent);
    }
}