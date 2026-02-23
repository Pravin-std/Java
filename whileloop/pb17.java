package whileloop;
import java.util.Scanner;
public class pb17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = num;
        int sum = 0;
        
        int i = 1;
        while(i < num)
        {
            if(num % i == 0)
            {
                sum += i;
            }
            i++;
        }
        if(sum==res){
        System.out.println(sum + " " +"is a perfect number");
        }else
        {
            System.out.println(res + " "+"is not a perfect number");
        }
    }
}
