package whileloop;
import java.util.Scanner;
public class pb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "secure123";
        int attempt = 3;

        while(attempt !=0)
        {
            String pass = sc.nextLine();
            if(pass.equals(password))
            {
                System.out.println("Access granted");
                break;
            }else
            {
                attempt--;
                System.out.println("Incorrect! Attempts reamining: "+attempt);
                if(attempt == 0)
                {
                    System.out.println("Account locked");
                }
            }
        }
    }
}
