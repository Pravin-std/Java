package whileloop;
import java.util.Scanner;
public class pb12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = n;
        int rev = 0;
        while(n !=0)
        {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        if(rev==check)
        {
            System.out.println(rev + "is a palindrome");
        }else
        {
            System.out.println(rev + "is not a palindrome");
        }
    }
}
