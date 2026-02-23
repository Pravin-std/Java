package whileloop;
import java.util.Scanner;
public class pb6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();
        int i = 1;
        while(i !=0)
        {
            int withdraw = sc.nextInt();
            if(withdraw > bal)
            {
                System.out.println("Insufficent funds! Try again");
            }else if(withdraw <= 100)
            {
                System.out.println("Invalid amount! Try again");
            }else
            {
                System.out.println("Withdrwaal Successful! Reamining balance: "+(bal-withdraw));
                break;
            }
        }
    }
}
