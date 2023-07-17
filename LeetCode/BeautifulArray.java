import java.util.ArrayList;

public class BeautifulArray {
    public static void main(String[] args) {
        int[] arr = { -3, -1, -19, 0, 6, -13, 12 };
        System.out.println(makeBeautiful(arr));
    }

    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        int high = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                if (arr[i] <= 0 && arr[i + 1] >= 0 || arr[i] >= 0 && arr[i + 1] <= 0) {
                    i++;
                } else {
                    ans.add(arr[i]);
                }
            } else {
                if (i == high) {
                    ans.add(arr[i]);
                }
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            if (i != ans.size() - 1) {
                if (ans.get(i) >= 0 && ans.get(i + 1) <= 0 || ans.get(i) <= 0 && ans.get(i + 1) >= 0) {
                    ans.remove(i);
                    ans.remove(i + 1);
                    i++;
                }
            }
        }

        return ans;
    }
}