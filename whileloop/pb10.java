package whileloop;
import java.util.Scanner;
public class pb10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

        int i = 0;
        while(i < n)
        {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
