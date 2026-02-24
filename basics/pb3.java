import java.util.Scanner;

public class pb3{
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int per = sc.nextInt();
        int gst = sc.nextInt();
        int total = price - (price * per / 100);
        int final_amt = total + (total * gst )/ 100;
        System.out.println(final_amt);

    } 
}

