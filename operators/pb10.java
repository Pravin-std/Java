package operators;
import java.util.Scanner;
public class pb10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int f = sc.nextInt();
        boolean alert = (unit > 500 || f == 1);
        System.out.println((alert) ? "Alert" : "Normal");
    }
}
