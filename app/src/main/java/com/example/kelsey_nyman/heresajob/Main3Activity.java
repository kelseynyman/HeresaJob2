package com.example.kelsey_nyman.heresajob;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

public class Main3Activity extends Activity {

    Button button1 = findViewById(R.id.button1);
    Button button2 = findViewById(R.id.button2);
    Button button3 = findViewById(R.id.button3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

}
