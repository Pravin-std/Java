package forloop;
import java.util.Scanner;
public class pb18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int active = 0;
        int count = 0,count1=0;
        for(int i = 0;i<n;i++)
        {
            sc.nextLine();
            String id = sc.nextLine();
            String type = sc.nextLine();
            int pur = sc.nextInt();

            int warrenty = 0;
            if(type.equals("Electronics")) warrenty = 12;
            else if(type.equals("Appliance")) warrenty = 24;
            else if(type.equals("Computer")) warrenty = 36;

            String status = "";

            int reamining = pur - warrenty;

            if(reamining == 0) {
                status = "Expired";
                count++;
            }else if(reamining >= 1 && reamining <= 3)
            {
                status = "Expiring Soon";
                count1++;
            }else if(reamining > 3)
            {
                status = "Active";
            }


            System.out.println("Product ID: "+id);
            System.out.println("Type: "+type);
            System.out.println("Warranty Period: "+pur+"months");
            System.out.println("Months Used: "+warrenty);
            System.err.println("Remaining: "+reamining);
            System.err.println("Status :" +status);
        }

        System.out.println("Total products:"+n);
        System.err.println("Active Warranties: "+active);
        System.err.println("Expired soon :" +count1);
        System.err.println("Expired Warranties:" + count);
    }
}
