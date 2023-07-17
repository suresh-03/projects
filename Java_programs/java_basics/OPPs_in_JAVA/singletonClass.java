package java_basics.OPPs_in_JAVA;

// singleton class - it does not allow multiple objects to create
// this class only have single object with instance

class singleton{
    static singleton obj = null; // creating null object for this class
                                 // because of static it is common for all

    private singleton(){}; // by making this class constructor as private
                           // we can't create object for this class

    public static singleton getInstance(){ // creating the static method with class itself
                                           // this method allows to create only one object

        if(obj == null){ // it checks for the obj is null 
                        
            return new singleton(); // if obj is null it allow us to create one object
        }
        else{
            return obj; // if obj is not null it will return object already created
        }
    }

    void display(){
        System.out.println("i am singleton class");
    }

    }


public class singletonClass {
    public static void main(String[] args) {
        singleton o = singleton.getInstance();
        o.display();
        // singleton o1 = new singleton(); is not possible because the object o is already created
    }
}
