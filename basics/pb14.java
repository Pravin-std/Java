import java.util.Scanner;
public class pb14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int basesalary = sc.nextInt();
        int s = sc.nextInt();
        int pps = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int salary = basesalary + (s * pps) + b - m;
        System.out.println(salary);
    }
}
