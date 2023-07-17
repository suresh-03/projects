import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("{({[]}{)}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stk.isEmpty()){
                if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                    return false;
                }
            }
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(stk.peek() == '('){
                    stk.pop();
                }
            }
             else if(s.charAt(i) == '}'){
                if(stk.peek() == '{'){
                    stk.pop();
                }
            }
             else if(s.charAt(i) == ']'){
                if(stk.peek() == '['){
                    stk.pop();
                }
            }
            else{
                return false;
            }
        }
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }
}
