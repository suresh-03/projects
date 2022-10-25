public class StringArraysAreEqual {
    public static void main(String[] args) {
        String[] word1 = { "a", "b", "c", "df" };
        String[] word2 = { "abcde" };

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String word1Str = "";
        String word2Str = "";

        for (int i = 0; i < word1.length; i++) {
            word1Str += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            word2Str += word2[i];
        }

        if (word1Str.equals(word2Str)) {
            return true;
        }

        return false;
    }
}
