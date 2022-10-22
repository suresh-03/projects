import java.util.ArrayList;

public class HighAltitude {
    public static void main(String[] args) {
        ArrayList<Integer> altitude = new ArrayList<>();
        int[] gain = { -4, -3, -2, 1, 2, 8, 4 };
        int ans = solution(gain, altitude);
        System.out.println(ans);
    }

    public static int solution(int[] gain, ArrayList<Integer> alt) {
        int temp = 0;
        int answer = 0;
        int len = gain.length;

        for (int i = 0; i < len + 1; i++) {
            if (i == 0) {
                alt.add(0);
            } else {
                temp = answer + gain[i - 1];
                alt.add(temp);
                answer = temp;
            }
        }

        int max = alt.get(0);

        for (int i = 1; i < alt.size(); i++) {
            if (alt.get(i) > max) {
                max = alt.get(i);
            }
        }

        return max;

    }
}
