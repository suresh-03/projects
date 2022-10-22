import java.util.ArrayList;
import java.util.Scanner;

//arraylist is used when we don't know the size of the array

public class IntegerArrayList {
    public static void main(String[] args) {

        //syntax for creating arralist
        //arraylist only work with rapper class like Integer and String
        //arraylist don't work in primitives like int,float etc.

        //arraylist can be written as
        //ArrayList listname = new ArrayList(); "this not a good practice";

        //here the initial capacity is 10
        //but it can be increased when we give more than 10
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            //adding the input to list
            list.add(in.nextInt());
        }

        //list is tostring in built so we can directly print it
        System.out.print(list);
    }
}
