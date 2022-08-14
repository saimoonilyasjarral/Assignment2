package com.example.login;

import androidx.annotation.NonNull;

public class ApplicationForm {
    public ApplicationForm(int ID, String studentName, String rollNo, String semester, String department, String program, int dated, String contact, String subject) {

        StudentName = studentName;

        RollNo = rollNo;

        Semester = semester;

        Department = department;
        Program = program;
        Dated = dated;
        Contact = contact;
        Subject = subject;
    }


    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public int getDated() {
        return Dated;
    }

    public void setDated(int dated) {
        Dated = dated;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }


    private String StudentName;
    private String RollNo;
    private String Semester;
    private String Department;
    private String Program;
    private int Dated;
    private String Contact;
    private String Subject;





    @NonNull
    @Override
    public String toString() {
        return "CardForm{" +
                ", StudentName='" + StudentName + '\'' +
                ", RollNo='" + RollNo + '\'' +
                ", Semester='" + Semester + '\'' +
                ", Department='" + Department + '\'' +
                ", Program='" + Program + '\'' +
                ", Dated=" + Dated +
                ", Contact='" + Contact + '\'' +
                ", Subject='" + Subject + '\'' +
                '}';
    }
}

