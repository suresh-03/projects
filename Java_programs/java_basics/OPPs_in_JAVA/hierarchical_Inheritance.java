package java_basics.OPPs_in_JAVA;

// hierarchical inheritance - many classes derived from one class

class human{

    String firstname,lastname;
  
}

// hierarchical inheritance

class suresh extends human {
    void show(){
        firstname = "suresh";
        lastname = "kumar";
        System.out.println(firstname + lastname);
    }
}

class sathish extends human {
    void show(){
        firstname = "sathish";
        lastname = "kumar";
        System.out.println(firstname + lastname);
    }
}

public class hierarchical_Inheritance {
    public static void main(String[] args) {
        suresh su = new suresh();
        su.show();

        sathish sa = new sathish();
        sa.show();
    }
}
