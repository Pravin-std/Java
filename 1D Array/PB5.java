public class PB5 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min = " + min);
    }
}