public class Isomorphic{
    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        System.out.println(find(s, t));
    }
    public static boolean find(String s, String t){
        int[] arrs = new int[s.length()];
        int[] arrt = new int[t.length()];

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(i != j){
                if((int)s.charAt(i)== (int)s.charAt(j)){
                    arrs[i] = j;
                }
                if((int)t.charAt(i) == (int)t.charAt(j)){
                    arrt[i] = j;
                }
                }
          
            }
           
        }

     if(arrs.length == arrt.length){
         for(int i = 0; i < arrs.length; i++){
             if(arrt[i] != arrs[i]){
                 count++;
             }
         }
         if(count == 0){
             return true;
         }
         else{
             return false;
         }
     }
     return false;
    }
}
