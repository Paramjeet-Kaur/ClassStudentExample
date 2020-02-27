package com.example.classstudentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner person;
    private Spinner count;

    ArrayList<String> persons = new ArrayList<String>();
    ArrayList<Integer> votes= new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        person=findViewById(R.id.voteCount);
        count=findViewById(R.id.votes);

    }
    public void CHOOSE(View view)
    {
        String currperson=person.getSelectedItem().toString();
        int currId= Integer.valueOf(count.getSelectedItem().toString());
        persons.add(currperson);
        votes.add(currId);
        System.out.println("Add new");

        Intent intent = new Intent(this, Result.class);

        intent.putStringArrayListExtra("PersonName",persons);
        intent.putIntegerArrayListExtra("vote",votes);
        startActivity(intent);

        }

    }

