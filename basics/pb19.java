import java.util.Scanner;
public class pb19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rentalDays = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int lateCharges = sc.nextInt();
        int  fuelCost = sc.nextInt();
        int maintenanceCost = sc.nextInt();
        int Profit = (rentalDays * rentPerDay) + lateCharges - fuelCost - maintenanceCost;
        System.out.println(Profit);
        }
}
