/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.enitity;

/**
 *
 * @author Prajwal
 */
public class Student {
 private int id;
 private String grade,Sfirstname,Slastname,faculty;
 private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSfirstname() {
        return Sfirstname;
    }

    public void setSfirstname(String Sfirstname) {
        this.Sfirstname = Sfirstname;
    }

    public String getSlastname() {
        return Slastname;
    }

    public void setSlastname(String Slastname) {
        this.Slastname = Slastname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Student(int id, String grade, String Sfirstname, String Slastname, String faculty, boolean status) {
        this.id = id;
        this.grade = grade;
        this.Sfirstname = Sfirstname;
        this.Slastname = Slastname;
        this.faculty = faculty;
        this.status = status;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", grade=" + grade + ", Sfirstname=" + Sfirstname + ", Slastname=" + Slastname + ", faculty=" + faculty + ", status=" + status + '}';
    }

}

