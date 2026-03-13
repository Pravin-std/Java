public class PB19 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] c = new int[a.length + b.length];

        int k = 0;
        for (int num : a) c[k++] = num;
        for (int num : b) c[k++] = num;

        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}