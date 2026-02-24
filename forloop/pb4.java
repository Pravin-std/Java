package forloop;
import java.util.Scanner;
public class pb4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        double tot = 0,tot_sale = 0;
        double max = 0;
        String per = "";
        for(i=0;i<n;i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            double sales = sc.nextDouble();

            int rate = 0;
            if(sales >=0 && sales <= 40000) rate = 5;
            else if(sales >=40001 && sales <= 80000) rate = 8;
            else if(sales >= 80001 && sales <=1000000) rate = 10;
            else if(sales >= 1000001 && sales <= 150000) rate = 12;
            else if(sales >= 150000) rate = 15;

            double com = sales * (rate / 100.0);

            double bonus = 0;
            if(sales >= 1000000) bonus = 2000;
            else if(sales >= 150000) bonus = 3000;

            double total = com + bonus;

            tot +=com;
            tot_sale += sales;
            
            if(sales > max) max = sales;  per = name;
            


            System.out.println("Sales Rep: "+name);
            System.out.println("Sales Amount: $"+sales);
            System.out.println("Commission Rate: "+rate+"%");
            System.out.println("Commission Earned: $"+com);
            System.out.println("Bonus: $"+bonus);
            System.out.println("Total Payout: $"+total);
        }

        System.out.println("Total Sales Reps: "+n);
        System.out.println("Total Sales: $"+tot_sale);
        System.out.println("Total Commissions: $"+tot);
        System.out.println("Top Performer: "+per);
    }
}