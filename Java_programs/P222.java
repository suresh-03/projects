import java.util.ArrayList;
import java.util.Scanner;

public class P222 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oct = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(4);
        ArrayList<Integer> octb = new ArrayList<>(4);
        int[] b = {4,2,1};
       

        int o = oct;

        while(o != 0){
            int temp = o % 2;
            arr.add(temp);
            o /= 2;
        }

        int k = 0;
        int[] bin = new int[arr.size()];

        for(int j = arr.size() - 1; j >= 0; j--){
            bin[k] = arr.get(j);
            k++;
        }

        // for(int l = 0; l < bin.length; l++){
        //     System.out.print(bin[l] + " ");
        // }

        int len = bin.length;

       while(len % 3 != 0){
            octb.add(0);
            len++;
       }

       for(int i = 0; i < bin.length; i++){
        octb.add(bin[i]);
       }

       int a = len / 3;
       int index = 0;
       int sum = 0;
       String ans = "";

       while(a != 0){
        for(int i = 0; i < b.length; i++){
            sum += octb.get(index) * b[i];
            index++;
        }
        a--;
        ans += Integer.toString(sum);
        sum = 0;
       }

       System.out.println(ans);
        
    }
}
