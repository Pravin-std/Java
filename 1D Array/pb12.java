public class PB12 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Smallest = " + second);
    }
}