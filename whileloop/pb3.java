package whileloop;
import java.util.Scanner;
public class pb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scercetNumber = sc.nextInt();
        int count = 0;
        int i = 1;
        while(i != 0)
        {
            System.out.println("Guess the number (1100):");
            int n = sc.nextInt();
            count++;
            if(n > scercetNumber)
            {
                System.out.println("Too high!");
            }else if(n < scercetNumber)
            {
                System.out.println("Too low!");
            }else
            {
                System.out.println("Correct!");
                break;
            }
            
            
        }
        System.out.println("Attempts: "+count);
    }
}
