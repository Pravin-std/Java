package operators;
import java.util.Scanner;
public class pb2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int wamt = sc.nextInt();
        int adl = sc.nextInt();
        boolean trans = (wamt <= ab && wamt <=adl);
        System.out.println((trans) ? "Approved"  : "Declined");
        
    }
}
