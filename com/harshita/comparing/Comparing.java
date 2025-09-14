package com.harshita.comparing;

public class Comparing {
    
}

// public interface GenericInterface<T>{
//     void display(T value)
// }

class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o){
        int diff = (int)(this.marks-o.marks);

        return diff;
    }

    public static void main(String[] args){
        Student kunal = new Student(2, 98.5f);
        Student rahul = new Student(6,96.5f);

        if (kunal.compareTo(rahul) >0){
            System.out.println("kunal has more marks");
        }
    }

}

