public class PB32 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};

        int total = 0;
        for (int num : arr) total += num;

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];

            if (leftSum == total) {
                System.out.println("Index = " + i);
                return;
            }

            leftSum += arr[i];
        }
    }
}