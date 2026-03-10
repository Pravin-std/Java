import java.util.Scanner;
public class pb1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        int total = input1 + input2 + input3 - input4 - input5;
        System.out.println(total);

    }
}