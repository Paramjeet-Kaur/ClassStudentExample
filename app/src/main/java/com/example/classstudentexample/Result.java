package com.example.classstudentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        persons=findViewById(R.id.Answer);

        String loop="";
        for(int i=0;i<getIntent().getStringArrayListExtra("Param").size();i++){
            loop+=getIntent().getStringArrayListExtra("vote").get(i)+"\n";
        }
         persons.setText(loop);
    }
}
