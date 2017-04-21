package com.example.a126308.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DailyGoals extends AppCompatActivity {

    Button btnOK;
    RadioGroup rgAns1, rgAns2, rgAns3;
    EditText etReflection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_goals);

        btnOK = (Button)findViewById(R.id.buttonOk);

        rgAns1 = (RadioGroup)findViewById(R.id.radioGroupAns1);
        rgAns2 = (RadioGroup)findViewById(R.id.radioGroupAns2);
        rgAns3 = (RadioGroup)findViewById(R.id.radioGroupAns3);

        etReflection = (EditText)findViewById(R.id.editTextReflection);


        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int rg1 = rgAns1.getCheckedRadioButtonId();
                int rg2 = rgAns2.getCheckedRadioButtonId();
                int rg3 = rgAns3.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton) findViewById(rg1);
                RadioButton rb2 = (RadioButton) findViewById(rg2);
                RadioButton rb3 = (RadioButton) findViewById(rg3);

;               String[] info = {etReflection.getText().toString(),rb1.getText().toString(), rb2.getText().toString()
                                , rb3.getText().toString()};

                Intent i = new Intent(DailyGoals.this,
                        DailyGoals2.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}
