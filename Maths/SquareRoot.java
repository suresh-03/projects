package Maths;

public class SquareRoot {
    public static void main(String[] args) {
        square(25);
    }
    static void square(int n){
        int i = 2;
        for(i = 2; i * i <= n; i++){
            if(i * i == n){
                System.out.println(i);
            }
        }
        if((i - 1) * (i - 1) != n){
            System.out.println(i - 1);
        }
       
    }
}
