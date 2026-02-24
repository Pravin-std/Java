import java.util.Scanner;

public class pb9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int perday = sc.nextInt();
    int days = sc.nextInt();
    int med = sc.nextInt();
    int labfees = sc.nextInt();
    int insu = sc.nextInt();
    int final_bill = (perday * days) + med + labfees - insu;
    System.out.println(final_bill);
}
}
