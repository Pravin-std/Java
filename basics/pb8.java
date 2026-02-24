import java.util.Scanner;
public class pb8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rodperhr = sc.nextInt();
        int hrsworked = sc.nextInt();
        int overtime = sc.nextInt();
        int rejectrod = sc.nextInt();
        int total = (rodperhr * hrsworked) + overtime - rejectrod;
        System.out.println(total);
    }
}
