package Strings;

public class GoalParser {
    public static void main(String[] args) {
        String a = "(al)G(al)()()G";
        System.out.println(interpret(a));
    }
    public static String interpret(String command) {
        String ans = "";
       for(int i = 0; i < command.length(); i++){
        if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
            ans += 'o';
            i++;
        }
        else if(command.charAt(i) == '(' || command.charAt(i) == ')'){
            ans += "";
        }
        else{
            ans += command.charAt(i);
        }
       }
       return ans;
    }
}
