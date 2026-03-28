public class PB38 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == target) {
                    System.out.println("From " + i + " to " + j);
                }
            }
        }
    }
}