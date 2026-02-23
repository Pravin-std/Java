package whileloop;
import java.util.Scanner;
public class pb16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int n = binary;
        int pow = 1;
        int res = 0;

        while(binary != 0)
        {
            int temp = binary % 10;
            res += temp * pow;
            pow = pow * 2;
            binary /= 10;

        }
        System.out.println("Binary: "+ " " + n);
        System.out.println("Decimal: "+ " " +res);
    }
}
