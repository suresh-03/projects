package OOPS.Static;

    // method that are static can be accessed in the non static methods
    // but the method that are are non-static can't be accessed in static methods
    // static elements (variables,methods,etc) are not depends on objects
    // static method can't be overrided

public class StaticInJava {
    public static void main(String[] args) {
        example obj = new example("suresh", 12);
        example obj2 = new example("kumar", 20);

        System.out.println(obj.name);
        System.out.println(obj2.name);
        System.out.println(example.population);
        // above can be called as obj or obj2.population
        System.out.println(obj.population);  // gives same answer get from above
        example.print();
        example.population = 8;
        System.out.println(example.population);
        obj.print2();
        System.out.println(example.gender);
       // example.gender = "female"; // its not possibe because it is final field
        // final is like constant its not cahngeable;

    }

    
}

class example{
    static int population;
    static final String gender;
    String name;
    int age;

    example(String name, int age){
        this.name = name;
        this.age = age;
        example.population += 1; // not depends on object that are created
        // it can be accessed as this.population but (classname.staticVariable) is
        // the better way to call static variales
    }

    static void print(){
       // System.out.println("hello" + this.name); // in static this keyword not 
        // used

        //System.out.println("hello" + name); // static doesn't allow non-static
        // elements inside it

        System.out.println(population);
    }

    void print2(){
        System.out.println("hello " + this.name);
        print(); // static elements can be used in non static method
    }

    static{
        gender = "male"; // static block is the block which is called first
        // when object is created in main method
        // note : it is called only once for one object creation
    }
}
