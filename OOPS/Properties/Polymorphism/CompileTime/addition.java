package OOPS.Properties.Polymorphism.CompileTime;

public class addition{
    int a;
    int b;
    static int num = 10;

    addition(){ // constructor overloading
        this.a = 1;
        this.b = 1;
    }

    addition(int a, int b){
        this.a = a;
        this.b = b;
    }

    addition(addition obj){
       this.a = obj.a;
       this.b = obj.b;
    }

    static void print(){ //method overloading
        System.out.println(num);
    }
    void print(int a, int b){
        System.out.println(a + b);
    }
    static void print(int a){
        System.out.println(a);
    }
}
