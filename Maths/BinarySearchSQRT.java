package Maths;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        System.out.printf("%.2f",SQRT(40,2));
    }
    static double SQRT(int n, int p){

        int s = 0;
        int e = n / 2;

        double root = 0.0;

        while(s <= e){
            int m = (s + e) / 2;

            if(m * m == n){
                return m;
            }

            if(m * m > n){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }


        double inc = 0.1;
        for(int i = 0; i < p; i++){
            while(root * root <= n){
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}
