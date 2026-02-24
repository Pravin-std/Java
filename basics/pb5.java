import java.util.Scanner;
public class pb5 {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    float per = sc.nextFloat();
    float gst = sc.nextFloat();
    int people = sc.nextInt();
    float total = amount + (amount * per) / 100;
    float final_amt = total + total * gst / 100;
     System.out.println(final_amt/people);
   } 
}
