import java.util.Scanner;
public class pb20 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int adRevenue = sc.nextInt();
        int sponsorshipIncome = sc.nextInt();
        int affiliateIncome = sc.nextInt();
        int tax = sc.nextInt();
        int productionCost = sc.nextInt();
        int Income = adRevenue + sponsorshipIncome + affiliateIncome - tax - productionCost;
        System.out.println(Income);
    }
}
