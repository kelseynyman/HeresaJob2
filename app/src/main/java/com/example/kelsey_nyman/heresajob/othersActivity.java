package com.example.kelsey_nyman.heresajob;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

public class othersActivity extends Activity {

    Button button9 = findViewById(R.id.button9);
    Button button10 = findViewById(R.id.button10);
    Button button11 = findViewById(R.id.button11);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
    }

}
