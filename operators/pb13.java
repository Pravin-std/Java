package operators;
import java.util.Scanner;
public class pb13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int connectionValue = sc.nextInt();
        int applianceMask = sc.nextInt();
        int appliance = (connectionValue & applianceMask);
        System.out.println( (appliance > 0) ? "Active" : "Inactive ");
    }
}
