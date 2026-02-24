import java.util.Scanner;
public class pb12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tr = sc.nextInt();
        int sr = sc.nextInt();
        int mcost = sc.nextInt();
        int elebill = sc.nextInt();
        int total = tr + sr - mcost - elebill;
        System.out.println(total);
    }
}
