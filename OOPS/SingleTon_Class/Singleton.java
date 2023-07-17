package OOPS.SingleTon_Class;

// singleton class is making only one object from this class

public class Singleton {
    static Singleton instance;
    int number;
  private Singleton(){

  }

  static Singleton getInstatnce(){
    if(instance == null){
        instance = new Singleton();
    }
    return instance;
  }

  
}
