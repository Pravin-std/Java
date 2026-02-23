package whileloop;
import java.util.Scanner;
public class pb13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = 1;
        while(n2 > 0)
        {
            res = n1 * res;
            n2--;
        }
        System.out.println(res);
    }
}
