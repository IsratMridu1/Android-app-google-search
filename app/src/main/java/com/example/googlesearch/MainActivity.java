package com.example.googlesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewId;
    private EditText textString;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewId = findViewById(R.id.textViewId);
        textString = findViewById(R.id.textString);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchData = textString.getText().toString();
                if(searchData.length()<1){
                    Toast.makeText(MainActivity.this, "Please enter some text into the input field", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, resultActivity.class);
                    intent.putExtra("stringValue", searchData);
                    startActivity(intent);
                }

            }
        });

    }
}