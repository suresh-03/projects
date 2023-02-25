package java_basics;

public class enhancedForLoop {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {40,50,60,70},
            {80,90}
        };

        for(int[] k : arr){
            for(int l : k){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
