import java.util.Scanner;
public class pb24 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int teamRegistration = sc.nextInt();
        int broadcastingRights = sc.nextInt();
        int sponsorship = sc.nextInt();
        int prizeMoney = sc.nextInt();
        int stadiumRent = sc.nextInt();
        int advertisingCost = sc.nextInt();
        int Remaining_fund = teamRegistration + broadcastingRights + sponsorship - prizeMoney - stadiumRent - advertisingCost;
        System.out.println(Remaining_fund);
    }
}
