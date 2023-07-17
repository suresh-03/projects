public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "AAHC";
        System.out.println(check(str));
    }

    static int check(String str) {
        int count = 0;
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                if (!checkPali(str, i, j)) {
                    count++;
                } else {
                    return count;
                }
                j--;
            } else {
                count++;
                j--;
            }
        }
        return count;
    }

    static boolean checkPali(String str, int s, int e) {
        while (s < e) {
            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
            } else {
                return false;
            }
        }
        return true;
    }
}
