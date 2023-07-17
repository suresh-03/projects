package OOPS.Properties.Polymorphism.Runtime;

public class actors2 extends actors {

    String name;

    actors2(){
        this.name = "no actors";
    }

    static void print(){ // static methods can't be overridden
        System.out.println("i am in actors2 class");
    }

    void print(String name){
        System.out.println("i am " + name + " in actors2 class");
    }
}
