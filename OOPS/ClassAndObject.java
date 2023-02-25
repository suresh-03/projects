package OOPS;

public class ClassAndObject {
    public static void main(String[] args) {
        // creating the object for student class
        Student student1 = new Student();
        System.out.println();

        // this will return their own datatype empty values
        // System.out.println(student1.rollNo);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);

        // assigning value to the object student1
        student1.rollNo = 13;
        student1.name = "suresh";
        student1.marks = 89;

        // this will print the assigned previous values
        System.out.println("manually assigned values:");

        System.out.println(student1.rollNo);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        // creating new object
        Student student2 = new Student();
        System.out.println();

        // this will print value that was in the default constructor
        System.out.println("default constructor values:");

        System.out.println(student2.rollNo);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        // creating new object
        Student student3 = new Student(311,"babu",100);
        System.out.println();
        
        //this will print the values that are assigned in the parameterased
        // constructor
        System.out.println("parameterised constructor value:");

        System.out.println(student3.rollNo);
        System.out.println(student3.name);
        System.out.println(student3.marks);

        // creating new object
        Student student4 = new Student(student2);
        System.out.println();

        // this will print respective values of all variables in the student2
        // object because the object passed inside the constructor
        System.out.println("constructor passed argument of other constructor value:");
        System.out.println(student4.rollNo);
        System.out.println(student4.name);
        System.out.println(student4.marks);

        //creating new object
        Student student5 = new Student(5);
        System.out.println();

        // this will print the constructor called inside the constructor
        // in Student() class at line :
        System.out.println("value of constructor that called inside the other constructor :");
        
        System.out.println(student5.rollNo);
        System.out.println(student5.name);
        System.out.println(student5.marks);

        // this not be changed because total is a final variable in class Student
        // student1.total = 8;

        // demo for Garbage collection
        Garbage a;

        for(int i = 0; i < 1000000000; i++){
            a = new Garbage();
        }


    }
}

class Student {
    int rollNo;
    String name;
    float marks;
    final int total = 100;

    // constructor
    Student (){
        this.rollNo = 3;
        this.name = "kumar";
        this.marks = 76;
    }

    // parameterised constructor
    Student (int rollNo, String name, float marks){ // constructor overloading
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // passing constructor inside constructor
    Student (Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student (int n){
       this (310,"hello",100);
    }
  
}

class Garbage{

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("object is removing");
    }
}
