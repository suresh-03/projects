package Patterns;

public class Pattern33 {
    public static void main(String[] args) {
        print33(5);
    }
    static void print33(int n){
        int k = 0;
        String a ="aBcDeFgHiJkLmNoPqRsTuVwXyZ";
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(k == 26){
                    k = 0;
                }
                System.out.print(a.charAt(k) + " ");
                k++;
            }
            System.out.println();
        }
    }
}
