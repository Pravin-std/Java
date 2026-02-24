import java.util.Scanner;
public class pb6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        int mileage = sc.nextInt();
        int price = sc.nextInt();
        int tollcharge = sc.nextInt();
        int total = (dis / mileage) * price + tollcharge;
        System.out.println(total);
    }
}
