import java.util.Scanner;

public class pb10 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int delivery = sc.nextInt();
    int ppd = sc.nextInt();
    int incentive = sc.nextInt();
    int fuelcost = sc.nextInt();
    int delearnings = (delivery * ppd) + incentive - fuelcost;
    System.out.println(delearnings); 

}
}