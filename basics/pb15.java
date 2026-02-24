import java.util.Scanner;
public class pb15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int price = sc.nextInt();
        int servicecharge = sc.nextInt();
        int commission = sc.nextInt();
        int revenue = (room * price) + servicecharge - commission;
        System.out.println(revenue);
    }
}
