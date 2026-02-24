import java.util.Scanner;
public class pb21 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int maintenanceCollection = sc.nextInt();
        int parkingFees = sc.nextInt();
        int  hallBooking  = sc.nextInt();
        int securitySalary = sc.nextInt();
        int electricityBill = sc.nextInt();
        int cleaningCost = sc.nextInt();
        int Balance  = maintenanceCollection + parkingFees + hallBooking - securitySalary - electricityBill - cleaningCost;
        System.out.println(Balance);
    }
}
