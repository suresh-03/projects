package Maths;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        factor2(36);
    }
    // time complexity = O(n)
    static void factor(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // time complexity = O(sqrt(n))
    static void factor1(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i == n / i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                }
              
            }
        }
    }

    // printing in sorted order
    static void factor2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i == n / i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
              
            }
        }
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
