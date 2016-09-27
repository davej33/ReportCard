package com.example.android.reportcard;

/**
 * Created by dnj on 9/27/16.
 */

public class Grades {

    private String mClassName;
    private String mGrade;

    public Grades(String className, String grade){
        mClassName = className;
        mGrade = grade;
    }

    public String getmClassName() {
        return mClassName;
    }

    public String getmGrade() {
        return mGrade;
    }
}
