public class PB39 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        int max = arr[0], min = arr[0], result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            result = Math.max(result, max);
        }

        System.out.println("Max Product = " + result);
    }
}