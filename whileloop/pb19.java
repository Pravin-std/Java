package whileloop;
import java.util.Scanner;
public class pb19 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int decimal = sc.nextInt();
    int sum = 0;
    int count = 0;
    while(decimal > 0)
    {
        int temp = decimal % 2;
        if(temp==0)
        {
         count++;
        }
         sum =sum * 10 + temp;
         decimal /=2;
    }
    System.out.print(sum);
    if(count > 1)
    {
      System.out.println("0");
    }
   } 
}
