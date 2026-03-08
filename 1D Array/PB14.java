import java.util.Arrays;
import java.util.Collections;

public class PB14 {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 3};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
