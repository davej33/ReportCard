package com.example.android.reportcard;

/**
 * Created by dnj on 9/27/16.
 */

public class Grades {


    // States
    private String mClassName;
    private String mGrade;


    // Constructor
    public Grades(String className, String grade){

        mClassName = className;
        mGrade = grade;
    }

    //Methods

    public String getmClassName() {
        return mClassName;
    }

    public String getmGrade() {
        return mGrade;
    }


}
