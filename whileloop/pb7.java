package whileloop;
import java.util.Scanner;
public class pb7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Menu: ");
            System.out.println("1.Addition");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
        
        int choice1;
        do
        {
        int choice =  sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
         choice1 = sc.nextInt();
        int res = 0;

            System.out.println("Choice: "+choice);
            
            if(choice > 0 && choice < 5)
            {
                switch(choice)
                {
                    case 1:
                        res = num1 + num2;
                        break;
                    case 2:
                        res = num1 - num2;
                        break;
                    case 3:
                        res = num1 * num2;
                        break;
                    case 4:
                        if(num2 !=0)
                        {
                            res = num1 / num2;
                        }else
                        {
                            System.out.println("error zero cannot be divide");
                        }
                        break;
                }
                System.out.println("Enter two Number: "+ num1 + " "+ num2);
                System.out.println("Result: "+res);
                System.out.println("Choice: "+ choice1 + " " + "Goodbye!");
            }else if(choice > 5)
            {
                System.out.println("Invalid Number");
            }
        }while(choice1 != 5);
        
    }
}
