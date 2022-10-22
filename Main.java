class Main{
    public static void main(String[] args){
       int a = solution(3, 7);
       System.out.println(a);
    }
    public static int solution(int low, int high){
        int result = 0;
        for(int i = low; i <= high; i++){
            if(i % 2 != 0){
                result += 1;
            }
           
        }
        
        return result;
    }
}