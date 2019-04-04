package com.example.kelsey_nyman.heresajob;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

public class SelfActivity extends Activity {

    Button button7 = findViewById(R.id.button7);
    Button button8 = findViewById(R.id.button8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);
    }

}
