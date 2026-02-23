package whileloop;
import java.util.Scanner;
public class pb21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int end = sc.nextInt();
        int i = 1;
        do
        {
            System.out.println(table + " "+ " x " + " "+  i + " = " + table * i);
            i++;
    
        }while(i<=end);
        sc.close();
    }
    
}
