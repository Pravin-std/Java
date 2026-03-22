public class PB31 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1};

        int maxLen = 1, count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
                maxLen = Math.max(maxLen, count);
            } else {
                count = 1;
            }
        }

        System.out.println("Length = " + maxLen);
    }
}