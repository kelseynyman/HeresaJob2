package com.example.kelsey_nyman.heresajob;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Activity();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelfActivity();
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOthersActivity();
            }
        });
    }

    private void openMain2Activity()
    {
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
    }

    private void openSelfActivity()
    {
        Intent intent2 = new Intent(this, SelfActivity.class);
        startActivity(intent2);
    }

    private void openOthersActivity()
    {
        Intent intent3 = new Intent(this, othersActivity.class);
        startActivity(intent3);
    }
}
