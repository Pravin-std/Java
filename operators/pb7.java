package operators;
import java.util.Scanner;
public class pb7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cartvalue = sc.nextInt();
        int membership = sc.nextInt();
        boolean shiping = (cartvalue > 999 || membership==1);
        System.out.println((shiping) ? "Free shiping" : "charges Applied");

    }
}
