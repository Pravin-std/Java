package whileloop;
import java.util.Scanner;
public class pb9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n <= 1)
        {
            isPrime = false;
        }

        int i  = 2;
        while(i<n)
        {
            if(n % i == 0)
            {
                isPrime = false;
            }
            i++;
        }
        if(isPrime){
        System.out.println(n +" "+ "is a Prime Number");
        }else
        {
            System.out.println(n +" "+ "is not a Prime Number");
        }
    }
}
