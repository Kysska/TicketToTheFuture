package com.example.tickettothefuture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button feedButton = findViewById(R.id.feed_button);
        Button sleepButton = findViewById(R.id.sleep_button);
        TextView feedText = findViewById(R.id.feed_text);
        TextView sleepText = findViewById(R.id.sleep_text);

        feedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPercentage = Integer.parseInt(feedText.getText().toString().replace("%", ""));
                if(currentPercentage < 100){
                    int newPercentage = currentPercentage + 10;
                    feedText.setText(newPercentage + "%");
                }

            }
        });

        sleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPercentage = Integer.parseInt(sleepText.getText().toString().replace("%", ""));
                if(currentPercentage < 100){
                    int newPercentage = currentPercentage + 5;
                    sleepText.setText(newPercentage + "%");
                }
            }
        });

    }
}