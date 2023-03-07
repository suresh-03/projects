package Maths;

public class SieveOfPrime {
    public static void main(String[] args) {
        int n = 100;
        boolean[] primes = new boolean[n + 1]; 
        seive(n, primes);
    }
    static void seive(int n, boolean primes[]){
        for(int i = 2; i * i <= n; i++){
            if(!primes[i]){
                for(int j = 2*i; j <= n; j += i){
                    primes[j] = true;
                }
            }
        }
        for(int k = 2; k <= n; k++){
            if(!primes[k]){
                System.out.print(k + " ");
            }
        }
       
    }
}
