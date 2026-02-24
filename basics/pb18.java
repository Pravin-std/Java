import java.util.Scanner;
public class pb18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int registrationCollection = sc.nextInt();
        int  sponsorshipAmount = sc.nextInt();
        int stallRent = sc.nextInt();
        int stageCost = sc.nextInt();
        int celebrityCost = sc.nextInt();
        int marketingCost = sc.nextInt();
        int Remaining_fund = registrationCollection + sponsorshipAmount + stallRent - stageCost - celebrityCost - marketingCost;
        System.out.println(Remaining_fund); 
    }
}
