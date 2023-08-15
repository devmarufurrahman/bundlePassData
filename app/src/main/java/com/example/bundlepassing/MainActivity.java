package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextBtn = findViewById(R.id.nextBtn);

        Intent btnNxt;
        btnNxt = new Intent(MainActivity.this, SecondActivity.class);
        btnNxt.putExtra("title","Student");
        btnNxt.putExtra("studentName","Noman");
        btnNxt.putExtra("roll",20);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(btnNxt);
            }
        });
    }
}