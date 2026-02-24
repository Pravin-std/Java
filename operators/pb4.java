package operators;
import java.util.Scanner;
public class pb4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cl = sc.nextInt();
        int amt = sc.nextInt();
        int card = sc.nextInt();
        boolean res = (amt <= cl && card==0);
        System.out.println((res) ? "Approved" : "Declined");
    }
}
