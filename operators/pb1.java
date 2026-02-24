package operators;
import java.util.Scanner;

public class pb1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int avg = (m1 + m2)/2;
        boolean check  = m1 >=50 && m2 >=50;
        boolean check1 = avg >=60;
        System.out.println((check && check1) ? "pass" : "Fail"); 

    }
}
