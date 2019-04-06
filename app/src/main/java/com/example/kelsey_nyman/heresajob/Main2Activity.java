package com.example.kelsey_nyman.heresajob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_helper);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain3Activity();
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEdgeActivity();
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoneyActivity();
            }
        });
    }

    private void openMain3Activity()
    {
        Intent intent1 = new Intent(this, Main3Activity.class);
        startActivity(intent1);
    }

    private void openEdgeActivity()
    {
        Intent intent2 = new Intent(this, EdgeActivity.class);
        startActivity(intent2);
    }

    private void openMoneyActivity()
    {
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
}
