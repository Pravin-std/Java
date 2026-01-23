public class PB41 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 4;

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Found at " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}