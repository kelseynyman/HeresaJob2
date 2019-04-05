package com.example.kelsey_nyman.heresajob;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class othersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGossipActivity();
            }
        });

        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoWorkActivity();
            }
        });

        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCleaningActivity();
            }
        });
    }

    private void openGossipActivity()
    {
        Intent intent1 = new Intent(this, gossipActivity.class);
        startActivity(intent1);
    }

    private void openNoWorkActivity()
    {
        Intent intent2 = new Intent(this, noworkActivity.class);
        startActivity(intent2);
    }

    private void openCleaningActivity()
    {
        Intent intent3 = new Intent(this, cleaningActivity.class);
        startActivity(intent3);
    }
}
