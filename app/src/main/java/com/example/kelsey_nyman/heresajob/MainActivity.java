package com.example.kelsey_nyman.heresajob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText emailText;
    private EditText numberText;
    private EditText addressText;
    private Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailText = findViewById(R.id.emailText);
        numberText = findViewById(R.id.numberText);
        addressText = findViewById(R.id.addressText);
        nextButton = findViewById(R.id.nextButton);
    }
}
