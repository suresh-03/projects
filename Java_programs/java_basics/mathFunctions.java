package java_basics;

public class mathFunctions {
    public static void main(String[] args) {
        //inbuild math functions in java.lang package

        System.out.println("round : " + Math.round(3.98));
        System.out.println("absolute : " + Math.abs(-89));
        System.out.println("ceil : "+ Math.ceil(5.9));
        System.out.println("floor : " + Math.floor(5.3));

        double a = 2;
        double b = 6;

        System.out.println("square root of b : " + Math.sqrt(b));
        System.out.println("max value in a and b : " + Math.max(a, b));
        System.out.println("min value in a and b : " + Math.min(a, b));
        System.out.println("log of a : " + Math.log(a));
        System.out.println("log10 of b : " + Math.log10(b));
        System.out.println("sin of a : " + Math.sin(a));
        System.out.println("cos of b : " + Math.cos(b));
        System.out.println("tan of a : " + Math.tan(a));
        System.out.println("power of b on a : " + Math.pow(a, b));
        System.out.println("tau : " + Math.TAU);

    }
}
