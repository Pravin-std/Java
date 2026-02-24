import java.util.Scanner;
public class pb22 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int copies = sc.nextInt();
        int  costPerCopy = sc.nextInt();
        int editingCharge = sc.nextInt();
        int designCharge = sc.nextInt();
        int distributorCommission = sc.nextInt();
        int marketingExpense = sc.nextInt();
        int Profit =  copies * costPerCopy + editingCharge + designCharge - distributorCommission - marketingExpense;
        System.out.println(Profit);
    }
}
