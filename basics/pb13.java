import java.util.Scanner;
public class pb13 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int ypa = sc.nextInt();
        int a = sc.nextInt();
        int ey = sc.nextInt();
        int dacrop = sc.nextInt();
        int final_yeild = (ypa * a) + ey - dacrop;
        System.out.println(final_yeild); 
    }
}
