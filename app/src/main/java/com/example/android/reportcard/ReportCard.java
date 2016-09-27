package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by dnj on 9/27/16.
 */

public class ReportCard extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_report);

        ArrayList<Grades> grade = new ArrayList<Grades>();

        grade.add(new Grades("English","A"));
        grade.add(new Grades("Math","A"));
        grade.add(new Grades("History","A"));
        grade.add(new Grades("Science","A"));
        grade.add(new Grades("Art","A"));

        GradesAdapter adapter = new GradesAdapter(this, grade);
        ListView listView = (ListView) findViewById(R.id.view_report);
        listView.setAdapter(adapter);
    }
}
