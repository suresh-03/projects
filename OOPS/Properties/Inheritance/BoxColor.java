package OOPS.Properties.Inheritance;

public class BoxColor extends Box{
    String color;
    int dark;

    BoxColor(String color, int dark){
        //super();
        this.color = color;
        this.dark = dark;
    }

    void print(){
        System.out.println("i am box color");
    }
}
