package Recursion.basic;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(counter(4040));
    }

    static int counter(int n){
        return count(n,0);
    }

    static int count(int n , int c){
        if(n == 0){
            return c;
        }
        if(n % 10 == 0){
            return count(n/10, c + 1);
        }
        else{
            return count(n/10,c);
        }
    }
}
