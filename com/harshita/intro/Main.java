package com.harshita.intro;
import static com.harshita.lec2.Lec2.message;

class Student {
    int rollno;
    String name;
    float marks;

    // public Student(int rollno, String name, float marks)
    // {
    //     this.rollno = rollno;
    //     this.name = name;
    //     this.marks = marks;
    // }

    // public Student(Student other)
    // {
    //     this.rollno = other.rollno;
    //     this.name = other.name;
    //     this.marks = other.marks;
    // }

    // // constructor chaining
    // public Student(){
    //     this(12, "random person", 89.0f);
    // }

    // void greeting(){
    //     System.out.println("hello I'm " + name);
    // }
}

public class Main {
    public static void main(String[] args){
        // Student barbie = new Student(96,"harshita",100.0f);
        // Student gosling = new Student(12, "yash", 97.0f);
        // Student teacher = new Student(gosling);
        // Student random = new Student();
        // barbie.rollno = 96;
        // barbie.name = "harshita";
        // barbie.marks = 100;
        // System.out.println(barbie.rollno);
        // System.out.println(barbie.name);
        // System.out.println(barbie.marks);
        // barbie.greeting();

        // System.out.println(gosling.rollno);
        // System.out.println(gosling.name);
        // System.out.println(gosling.marks);
        // gosling.greeting();

        // System.out.println(teacher.rollno);
        // System.out.println(teacher.name);
        // System.out.println(teacher.marks);
        // teacher.greeting();

        // System.out.println(random.rollno);
        // System.out.println(random.name);
        // System.out.println(random.marks);
        // random.greeting();

        Student kunal = new Student();

        System.out.println(kunal);
        message();

        Main obj = new Main();
        obj.havingFun();
    }

    public void haveFun(){
        System.out.println("I am having fun");
    }

    public void havingFun(){
        haveFun();
    }
}

