package com.example.heba.readjson.com.example.pojo;

/**
 * Created by Heba on 4/9/2016.
 */
public class Employee {

    private String fName;
    private String lName;
    private int num;

    public Employee() {
    }

    public Employee(String fName, String lName, int num) {
        this.fName = fName;
        this.lName = lName;
        this.num = num;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", num=" + num +
                '}';
    }
}
