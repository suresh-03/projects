package DSA_problems.Strings.Easy;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int[] arr = new int[s.length()];

        int sum = 0;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                arr[i] = map.get(s.charAt(i));
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i != arr.length-1){
                if(arr[i] >= arr[i+1]){
                    sum += arr[i];
                }
                else if(arr[i] < arr[i+1]){
                    sum += arr[i+1]-arr[i];
                    i++;
                }
            }
            else{
                    sum += arr[i];
                
            }
          
        }
        return sum;

    }
}
