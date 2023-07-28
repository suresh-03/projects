public class checkPrime {
    public static void main(String[] args) {
        int a = 13;
        System.out.println(check(a,(int)(Math.sqrt(a))));
    }
    public static int check(int n,int k){
          if(k < 2){
            return 1;
        }
        if(n % k == 0){
            return 0;
        }
      
        return check(n,k-1);
    }
}
