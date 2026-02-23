package whileloop;
import java.util.Scanner;
public class pb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int fact = 1;

        while(n != 0)
        {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of "+ m + " = "+fact);
    }
}
