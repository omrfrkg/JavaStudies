package com.omrfrkg.javaoop;

public class Student {

    private String name;
    private String age;
    private int no;


    public Student(String name, String age, int no) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
