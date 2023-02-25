package java_basics.OPPs_in_JAVA;

// storing objects in the array

class animals{
    String name;
    int count;

    animals(String n, int c){
        this.name = n;
        this.count = c;
    }

    void print(){
        System.out.println("name of the animal: " + name);
        System.out.println("counts in the forest: " + count);
        System.out.println("-----------------------------------");
    }
}

public class arrayOfObjects {
    public static void main(String[] args) {
        // array creation
        animals[] a = new animals[5];

        // array of objects storing
        a[0] = new animals("lion", 20);
        a[1] = new animals("tiger", 46);
        a[2] = new animals("elephant", 100);
        a[3] = new animals("monkey", 390);
        a[4] = new animals("rhino", 13);

        // printing objects in th array
        for(int i = 0; i < a.length; i++){
            a[i].print();
        }
        
    }
}
