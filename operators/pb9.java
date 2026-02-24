package operators;
import java.util.Scanner;
public class pb9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int unm = sc.nextInt();
        int pm = sc.nextInt();
        int al = sc.nextInt();
        boolean match = (unm == 1 && pm == 1 && al == 0);
        System.out.println((match) ? "Login Success" : "Login Failed");   
    }
}
