package java_basics.OPPs_in_JAVA;


abstract class mobile{
    void voiceCall(){
        System.out.println("good quality voice call");
    }
    // abstract methods
    abstract void camera();
    abstract void display();
    abstract void processor();
}


// abstract methods can be used only by defining body of them in the derived classes.
class samsung extends mobile{
    void camera(){
        System.out.println("108 mega pixel camera");
    }
    void display(){
        System.out.println("full hd+ amoled display");
    }
    void processor(){
        System.out.println("exynos 9800 series");
    }
}

class redmi extends mobile{
    void camera(){
        System.out.println("64 mega pixel camera");
    }
    void display(){
        System.out.println("hdr 10+ amoled display");
    }
    void processor(){
        System.out.println("snapdragon 880+ series");
    }
}

class realme extends mobile{
    void camera(){
        System.out.println("48 mega pixel camera");
    }
    void display(){
        System.out.println("full hd+ amoled display");
    }
    void processor(){
        System.out.println("mediatek helio G95 series");
    }
}

public class abstract_Class_Example {
    public static void main(String[] args) {
        samsung m31 = new samsung();
        m31.camera();
        m31.display();
        m31.processor();
        m31.voiceCall();
        System.out.println("----------------------------------");

        redmi k40 = new redmi();
        k40.camera();
        k40.display();
        k40.processor();
        k40.voiceCall();
        System.out.println("----------------------------------");

        realme x30 = new realme();
        x30.camera();
        x30.display();
        x30.processor();
        x30.voiceCall();
        System.out.println("----------------------------------");


    }
}
