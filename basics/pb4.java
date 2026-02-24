import java.util.Scanner;
public class pb4 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int fees = sc.nextInt();
        int ss = sc.nextInt();
        int examfees = sc.nextInt();
        int libraryfees = sc.nextInt();
        int total =fees - (ss * fees / 100) + examfees + libraryfees ;
        System.out.println(total);
    }
}
