import java.util.Scanner;
public class pb7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int amt = sc.nextInt();
        int bonus = sc.nextInt();
        int charge = sc.nextInt();
        int total = (base * amt) + bonus - charge;
        System.out.println(total);
    }
}
