package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dnj on 9/27/16.
 */

public class ReportCard extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_report);

        ArrayList<String> grade = new ArrayList<String>();

        grade.add("English");
        grade.add("A");
        grade.add("Math");
        grade.add("A");
        grade.add("History");
        grade.add("A");
        grade.add("Science");
        grade.add("A");
        grade.add("Football");
        grade.add("F");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grade);
        GridView listView = (GridView) findViewById(R.id.view_report);
        listView.setAdapter(adapter);


        TextView nameView = (TextView) findViewById(R.id.name);
        final String name = "Ray Finkle";
        nameView.setText(name);

        TextView yearView = (TextView) findViewById(R.id.year);
        final String year = "2016";
        yearView.setText(year);

        TextView termView = (TextView) findViewById(R.id.term);
        final String term = "Spring";
        termView.setText(term);

        TextView majorView = (TextView) findViewById(R.id.major);
        final String major = "Porpoise Theft Management";
        majorView.setText(major);
    }
}
