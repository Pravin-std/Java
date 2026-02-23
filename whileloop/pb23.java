package whileloop;
import java.util.*;
public class pb23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int count= 0;
        for(;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count++;
            }
    
        }
        System.out.println("Vowel count: "+count);
    }
}
