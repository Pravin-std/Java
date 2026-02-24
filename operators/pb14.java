package operators;
import java.util.Scanner;
public class pb14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int permissionA  = sc.nextInt();
        int permissionB  = sc.nextInt();
        int mpc = (permissionA  | permissionB);
        System.out.println(mpc);
    }
}
