import java.util.Scanner;
public class pb23 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int ratePerKg = sc.nextInt();
        int priorityCharges = sc.nextInt();
        int insuranceFees = sc.nextInt();
        int handlingCharges = sc.nextInt();
        int fuelSurcharge = sc.nextInt();
        int Revenue  = weight * ratePerKg + priorityCharges + insuranceFees - handlingCharges - fuelSurcharge;
        System.out.println(Revenue);
    }
}
