package operators;
import java.util.Scanner;
public class pb11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int bb = sc.nextInt();
        int levels = sc.nextInt();
        int totalcapacity = bb << levels;
        System.out.println(totalcapacity);
    }
}
