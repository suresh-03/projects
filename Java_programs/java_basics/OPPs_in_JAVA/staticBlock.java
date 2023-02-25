package java_basics.OPPs_in_JAVA;

// static block - this block will called when the class is started to applied.


// these static blocks are called once this class is initialized in the main class
class blockTest{
    static{
        System.out.println("blockTest-1");
    }
    static{
        System.out.println("blockTest-2");
    }
}

// these static blocks are called once the main class is initialised or compiled before the main function
public class staticBlock {
    static{
        System.out.println("block-1");
    }
    public static void main(String[] args) {
        blockTest b = new blockTest();
        System.out.println("main");
        
    }
    static{
        System.out.println("block-2");
    }
}
