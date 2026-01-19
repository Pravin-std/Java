public class PB46 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};

        int[] result = new int[arr.length];
        int pos = 0, neg = 1;

        for (int num : arr) {
            if (num >= 0 && pos < arr.length) {
                result[pos] = num;
                pos += 2;
            } else if (neg < arr.length) {
                result[neg] = num;
                neg += 2;
            }
        }

        for (int num : result) System.out.print(num + " ");
    }
}