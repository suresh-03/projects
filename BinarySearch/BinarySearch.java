package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 67, 89, 90 };
        int target = 19;
        System.out.println(search(arr, target));
        System.out.println(findPeak(arr, target));
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0] < arr[arr.length - 1];

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int findPeak(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0] < arr[arr.length - 1];

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == t) {
                return mid;
            }
            if (isAsc) {
                if (t < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (t < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}
