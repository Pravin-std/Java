
package operators;
import java.util.Scanner;
public class pb3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int whrs = sc.nextInt();
        int adper = sc.nextInt();
        boolean bonus = (whrs >=40 && adper >=90);
        System.out.println((bonus) ? "Eligible" : "Not Eligible");
    }
}
