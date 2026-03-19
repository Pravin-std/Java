import java.util.HashSet;

public class PB28 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : a) set.add(num);
        for (int num : b) set.add(num);

        System.out.println(set);
    }
}