public class SpecialFibnocci {
    public static void main(String[] args) {
        System.out.println(specialFib(10));
    }
    public static int specialFib(int n){
        if(n < 2){
            return 1;
        }
        return specialFib(n-1)^specialFib(n-2);
    }
}
