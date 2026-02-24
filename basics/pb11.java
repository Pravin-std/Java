import java.util.Scanner;
public class pb11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        int rate = sc.nextInt();
        int maintenance = sc.nextInt();
        int da = sc.nextInt();
        int subsidy = sc.nextInt();
        int ttf = (dis * rate) + maintenance + da - subsidy;
        System.out.println(ttf);
    }
}
