package whileloop;
import java.util.Scanner;
public class pb20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = num;
        int sum =0;
        int temp = 0;
        while(num !=0)
        {
            int fact = 1;
            temp = num % 10;
            for(int i = 1;i<=temp;i++)
            {
                fact = fact * i;
            }
            sum +=fact;
            num /= 10;
        }
        if(res==sum)
        {
            System.out.println(res +" "+ "is a Strong Number");
        }else
        {
            System.out.println(res + "is not a Strong Number");
        }
    }
}
