package operators;
import java.util.Scanner;
public class pb8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int idproof = sc.nextInt();
        boolean entry = (age >=18 && idproof==1);
        System.out.println((entry) ? "Allowed" : "Denied");
    }
}
