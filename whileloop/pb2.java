package whileloop;
import java.util.Scanner;
public class pb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int i = 1;
        while(i !=0)
        {
            int n = sc.nextInt();
            if(n == 0)
            {
                break;
            }
            else
            {
                System.out.println("Enter number (0 to stop):"+n);
                sum += n;
                count++;
            }
            i++;
        }
        System.out.println("Total sum:"+sum);
        System.out.println("Count: "+count);
    }
}
