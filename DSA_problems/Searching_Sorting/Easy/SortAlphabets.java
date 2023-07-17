package DSA_problems.Searching_Sorting.Easy;

// https://practice.geeksforgeeks.org/problems/counting-sort/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class SortAlphabets {s
    public static void main(String[] args) {
        String a = "zyxwvutsrqponmlkjihgfedcba";
        System.out.println(sort(a));
    }
    static String sort(String a){
        StringBuilder s = new StringBuilder();
        int[] arr = new int[a.length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)a.charAt(i);
        }
        for(int i = 0; i < a.length(); i++){
            for(int j = i + 1; j < a.length(); j++){
              if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
              }
            }
        }
        for(int i = 0; i < arr.length; i++){
            s.append((char)arr[i]);
        }
        return s.toString();
    }
}
