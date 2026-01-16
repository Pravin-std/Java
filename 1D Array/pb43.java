import java.util.Arrays;

public class PB43 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(arr);

        System.out.println("Kth Smallest = " + arr[k - 1]);
    }
}