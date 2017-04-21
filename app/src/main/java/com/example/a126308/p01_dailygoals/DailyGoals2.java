package com.example.a126308.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DailyGoals2 extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;
    Button btnClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_goals2);

        tv1 = (TextView)findViewById(R.id.textView1);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);
        tv4 = (TextView)findViewById(R.id.textView4);

        btnClose = (Button)findViewById(R.id.ButtonClose);
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");

        // Display the name and age on the TextView
        tv1.setText("Read up on material before class: " + info[1]);
        tv2.setText("Arrive on time so as not to miss important part of the lesson: " + info[2]);
        tv3.setText("Attempt the problem myself: " + info[3]);
        tv4.setText("Reflection: " + info[0]);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
