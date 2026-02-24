package operators;
import java.util.Scanner;
public class pb5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int cs = sc.nextInt();
        boolean check = (salary > 25000 && cs >= 750);
        System.out.println((check) ? "Approved" : "Rejected");
    }
}
