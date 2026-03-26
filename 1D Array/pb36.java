public class PB36 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.println("First Non-Repeating = " + arr[i]);
                return;
            }
        }
    }
}