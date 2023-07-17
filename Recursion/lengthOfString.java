public class lengthOfString {
    public static void main(String[] args) {
        //System.out.println(length("naveen",0));
        System.out.println(recLen("naveen"));
    }
    public static int length(String str,int temp){
        try{
       str.charAt(temp);
    }
        catch(Exception e){
            return temp;
        }
        
       
        return length(str,temp+1);
    }
    // another method
    private static int recLen(String str)
    {
 
        // if we reach at the end of the string
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }
}
