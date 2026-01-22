import java.util.Arrays;

public class PB49 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0) {
            double median = (arr[n/2] + arr[n/2 - 1]) / 2.0;
            System.out.println("Median = " + median);
        } else {
            System.out.println("Median = " + arr[n/2]);
        }
    }
}