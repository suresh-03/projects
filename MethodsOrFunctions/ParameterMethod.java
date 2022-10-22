import java.util.Scanner;

public class ParameterMethod {
    public static void main(String[] args) {
        name("suresh");
        name("kumar");
    }

    static void name(String nam) {
        System.out.println("welcome " + nam + "!");
    }

}
