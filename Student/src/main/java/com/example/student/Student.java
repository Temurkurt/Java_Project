package com.example.student;
public class Student {
    private String Name;

    private int Id;
    private int Grade;

    public Student(String Name,
                   int Id,
                   int Grade) {
        this.Name = Name;
        this.Id = Id;
        this.Grade = Grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id){
        Id=id;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade){
        Grade=grade;
    }


   @Override
    public String toString(){
        return String.format("Name: " + this.Name+
                "\nId: " + this.Id +
                "\nGrade: " + this.Grade);
   }
}
