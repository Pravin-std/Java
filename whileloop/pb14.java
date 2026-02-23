package whileloop;
import java.util.Scanner;
public class pb14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arm = n;
        int rev = 0;
        while(n !=0)
        {
            int temp = n % 10;
            rev += temp * temp * temp;
            n = n / 10;
        }
        if(arm == rev)
        {
            System.out.println(arm + "is a armstrong number");
        }else
        {
            System.out.println(arm + "is not a armstrong number");
        }
    }
}
