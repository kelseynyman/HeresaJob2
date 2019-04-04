package com.example.kelsey_nyman.heresajob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button button4 = findViewById(R.id.button4);
    Button button5 = findViewById(R.id.button5);
    Button button6 = findViewById(R.id.button6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_helper);
    }
}
