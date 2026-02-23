package whileloop;
import java.util.Scanner;
public class pb22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n1 = start, n2 = end;
        int sum = 0;
        while(start != end)
        {
            if(start % 2 == 0)
            {
                sum +=start;
            }
            start++;
        }
        System.out.println("Sum of even numbers from "+ n1 + "to"+ n2 + ":"+ sum);
    }
}
