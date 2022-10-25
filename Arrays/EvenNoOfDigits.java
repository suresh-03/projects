public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = { 22, 4345, 678, 2352, 234523, 2345, 444 };
        int solution = findNumbers(arr);
        System.out.println(solution);
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp != 0) {
                int mod = temp % 10;
                temp = temp / 10;
                count++;
            }
            if (count % 2 == 0) {
                result += 1;
            }
            count = 0;
        }

        return result;
    }
}
