package OOPS.Properties.Polymorphism.Runtime;

public class actors{
    String name;
    int age;

    actors(){
        this.name = "no actor";
        this.age = 0;
    }
    actors(String name, int age){
        this.name = name;
        this.age = age;
    }

    static void print(){  // static methods can't be overridden
        System.out.println("i am in actors class"); 
    }
    void print(String name){
        System.out.println("i am " + name + " in actors class");
    }
}
