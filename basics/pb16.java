import java.util.Scanner;
public class pb16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int generalPassengers = sc.nextInt();
        int generalFare = sc.nextInt();
        int acPassengers = sc.nextInt();
        int acFare = sc.nextInt();
        int platformCollection = sc.nextInt();
        int maintenanceCost = sc.nextInt();
        int fuelCost = sc.nextInt();
        int Net_revenue = (generalPassengers * generalFare) + (acPassengers * acFare) + platformCollection - maintenanceCost - fuelCost;
        System.out.println(Net_revenue);
    }
}