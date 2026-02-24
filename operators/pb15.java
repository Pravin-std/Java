package operators;
import java.util.Scanner;
public class pb15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int signalValue   = sc.nextInt();
        int toggleMask  = sc.nextInt();
        int ts = (signalValue  ^ toggleMask);
        System.out.println(ts);
    }
}
