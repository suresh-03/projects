public class LongestCharacterReplacement{
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 2));
    }
    public static int characterReplacement(String s, int k) {
        int repeat = 0,start = 0, max = 0;
        int[] arr = new int[26];
        for(int end = 0; end < s.length(); end++){
            arr[s.charAt(end)-'A']++;
            repeat = Math.max(repeat, arr[s.charAt(end)-'A']);

            if((end - start + 1)-repeat > k){
                arr[s.charAt(start)-'A']--;
                start++;
            }
            max = Math.max(end-start+1, max);
        }
        return max;
    }
}
