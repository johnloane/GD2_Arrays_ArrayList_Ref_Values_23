package com.dkit.gd2.johnloane.staticexample;

import java.util.ArrayList;

public class Student
{
    /* Write a Student class
    A student has an ID number, year, list of modules that they are currently taking and results for each of those modules
    Need methods to add a module, add a result for a module
    You should be able to print out the details of the student and their modules and marks
    Also want to keep track of how many students have been constructed
    Need to demonstrate the use of static and non-static methods and want to address the error of accessing non-static method in static context
     */
    private String studentID;
    private int year;
    private ArrayList<DKITModule> modules;

    private static int numberOfStudentsCreated = 0;

    public Student(String studentID, int year)
    {
        this.studentID = studentID;
        this.year = year;
        this.modules = new ArrayList<>();
        numberOfStudentsCreated++;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public int getYear()
    {
        return year;
    }

    public ArrayList<DKITModule> getModules()
    {
        return modules;
    }

    public static int getNumberOfStudentsCreated()
    {
        return numberOfStudentsCreated;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", year=" + year +
                ", modules=" + modules +
                '}';
    }

    public boolean addModuleAndResult(DKITModule newModule)
    {
        if(!checkIfModuleExists(newModule))
        {
            this.modules.add(newModule);
            return true;
        }
        else
        {
            return false;
        }

    }

    private boolean checkIfModuleExists(DKITModule newModule)
    {
        for(DKITModule currentModule : this.modules)
        {
            if(currentModule.getName().equals(newModule.getName()))
            {
                return true;
            }
        }
        return false;
    }
}
