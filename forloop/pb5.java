package forloop;
import java.util.Scanner;
public class pb5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        double sum = 0;
        double max = 0;
        int count = 0;
        int peak = 0;
        for(i=1;i<=n;i++)
        {
            int day = sc.nextInt();
            int rooms_occ = sc.nextInt();
            int tot_room = sc.nextInt();

            double rate = (rooms_occ / tot_room) * 100.0;

            String sts = "";
            if(rate <= 60) sts = "Low";
            else if(rate > 60 && rate <=79) sts = "Moderate";
            else if(rate >=80 && rate <100) sts = "High";
            else if(rate >= 100) sts = "Full";

            sum += rate;

            if(rate > max)
            {
                max = rate;
                peak = n;
            }

            if(rate == 100.0)
            {
                count++;
            }

            System.out.println("Day :"+i);
            System.out.println("Romms Occupied :"+rooms_occ);
            System.out.println("Total Rooms: "+tot_room);
            System.out.println("Occupancy Rate: "+rate+"%");
            System.out.println("Status :"+sts);

        }

        System.out.println("Total days Analyzed : "+n);
        System.out.println("Average Occupancy Rate: "+sum/n);
        System.out.println("Peak Occupancy Day: Day"+peak);
        System.out.println("Days at Full Capacity: "+count);
    }
}