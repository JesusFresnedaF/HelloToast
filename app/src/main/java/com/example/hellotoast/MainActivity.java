package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.showCount);
        txt.setText("0");

        button1 = findViewById(R.id.button_toast);
        button1.setText("Toast");

        button2 = findViewById(R.id.button_count);
        button2.setText("Count");
    }
}