import java.util.Scanner;

public class pb2 {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int plan = sc.nextInt();
    int gb = sc.nextInt();
    int cost = sc.nextInt();
    int per = sc.nextInt();
    float total = plan + (gb * cost);
    float final_amt = total + (total * per / 100);
    System.out.println(final_amt);

     
    
    }
}
