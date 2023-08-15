package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        Intent studentList = getIntent();
        String sInfo = studentList.getStringExtra("title");
        String sName = studentList.getStringExtra("studentName");
        int sRoll = studentList.getIntExtra("roll", 0);

        textView.setText("Student Name : " + sName + " Roll : " + sRoll);

//        getSupportActionBar().setTitle("nakjf");

    }
}