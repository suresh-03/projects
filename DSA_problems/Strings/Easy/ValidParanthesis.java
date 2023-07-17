
// https://leetcode.com/problems/valid-parentheses/
public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(validParanthesis("()[]{}"));
    }
    public static boolean validParanthesis(String s){
        StringBuilder arr = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                arr.append(s.charAt(i));
            }
            else{
                if(arr.length() != 0){
                    if(s.charAt(i) == ']' && arr.charAt(arr.length()-1) == '['|| s.charAt(i) == ')' && arr.charAt(arr.length()-1) == '('||
                    s.charAt(i) == '}' && arr.charAt(arr.length()-1) == '{' ){
                        arr = arr.replace(arr.length()-1,arr.length(),"");
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
                
            }
        }
        if(arr.length() == 0){
            return true;
        }
        return false;
    }
}
