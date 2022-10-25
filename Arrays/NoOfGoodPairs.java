
public class NoOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 2, 3, 1 };
        int count = 0;
        int len = arr.length;
        int k = 1;

        for (int i = 0; i < (len - 1); i++) {
            for (int j = k; j < len; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("(" + i + "," + j + ")");
                    count++;
                }
            }
            k++;
        }

        System.out.println(count);
    }
}
