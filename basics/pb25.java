import java.util.Scanner;
public class pb25 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int residentialUsage = sc.nextInt();
        int residentialRate = sc.nextInt();
        int commercialUsage = sc.nextInt();
        int commercialRate = sc.nextInt();
        int connectionFees = sc.nextInt();
        int penaltyCollection = sc.nextInt();
        int pipelineMaintenance = sc.nextInt();
        int treatmentCost = sc.nextInt();
        int  net_revenue = (residentialUsage * residentialRate) + (commercialUsage * commercialRate) +  connectionFees + penaltyCollection - pipelineMaintenance - treatmentCost;
        System.out.println(net_revenue);
    }
}
