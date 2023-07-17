package java_basics.OPPs_in_JAVA;

// multiple inheritance can be achieved by interface in java

interface phone{
    void call();
    void sms();
}

interface smartphone{
    void touch();
    void games();
    void music();
    void video();
    void apps();
}
// multiple inheritance
class oppo implements phone,smartphone{

    @Override
    public void touch() {
        // TODO Auto-generated method stub
        System.out.println("it has touch screen");
    }

    @Override
    public void games() {
        // TODO Auto-generated method stub
        System.out.println("it supports games");
    }

    @Override
    public void music() {
        // TODO Auto-generated method stub
        System.out.println("it play musics");
    }

    @Override
    public void video() {
        // TODO Auto-generated method stub
        System.out.println("it plays videos");
    }

    @Override
    public void apps() {
        // TODO Auto-generated method stub
        System.out.println("it supports apps");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("it supports voice call");
    }

    @Override
    public void sms() {
        // TODO Auto-generated method stub
        System.out.println("it supports sms facility");
    }
    
}

public class multipleInheritance_Interface {
    public static void main(String[] args) {
        oppo f11 = new oppo();
        f11.apps();
        f11.call();
        f11.games();
        f11.music();
        f11.touch();
        f11.video();
        f11.sms();
    }
}
