package whileloop;
import java.util.Scanner;
public class pb18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1 = a, n2 = b;
        int gcd = 0;

        while(a != b)
        {
            if(a > b)
            {
                a = a - b;
            }else
            {
                b = b - a;
            }
        }
        int lcm = (n1 * n2) / a;
        System.out.println("LCM of "+ n1 + "and" + n2 + " = " + lcm);
    }
}
