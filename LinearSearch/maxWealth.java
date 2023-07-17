package LinearSearch;

public class maxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,56},
            {4,9,8,100},
            {3,9}
        };

        System.out.println(maximum(arr));
    }

    static int maximum(int[][] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int a = 0;
            for(int j = 0; j < arr[i].length; j++){
                a += arr[i][j];
            }
            if(a > max){
                max = a;
            }
        }
        return max;
    }
}
