package com.example.kelsey_nyman.heresajob;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class SelfActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCubicalActivity();
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCuriousActivity();
            }
        });
    }

    private void openCubicalActivity()
    {
        Intent intent1 = new Intent(this, cubicalActivity.class);
        startActivity(intent1);
    }

    private void openCuriousActivity()
    {
        Intent intent2 = new Intent(this, curiousActivity.class);
        startActivity(intent2);
    }
}
