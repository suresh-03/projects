package OOPS.PackagesInJava.manUseGreet;

// 1st way to directly import method
import static OOPS.PackagesInJava.greeting.greet.message;

// second way
import OOPS.PackagesInJava.greeting.greet;

public class man {
    public static void main(String[] args) {
        message("suresh");
        greet.message("kumar");
    }
}
