package ConditionStatement;
import java.util.Scanner;
public class pb25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double datagb = sc.nextDouble();
        int callmin = sc.nextInt();
        sc.nextLine();
        String Intuse = sc.nextLine();
        String devtype= sc.nextLine();


        System.out.println("Data Usage : "+datagb);
        System.out.println("Call Minutes: "+callmin+" Mintues");
        System.out.println("International Usage: "+Intuse);
        System.out.println("Device Type: "+devtype);

    }
}
