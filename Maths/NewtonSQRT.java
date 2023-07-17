package Maths;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.printf("%.2f",SQRT(36));
    }
    static double SQRT(int n){
        double x = n;
        double root;

        while(true){
            root = (0.5 * (x + (n/x)));
            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
