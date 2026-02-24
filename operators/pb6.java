package operators;
import java.util.Scanner;
public class pb6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int familyincome = sc.nextInt();
        int per = sc.nextInt();
        boolean ss = (familyincome < 200000 && per >=75);
        System.out.println((ss) ? "Granted" : "Not Granted");
    }
}
