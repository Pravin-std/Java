import java.util.Scanner;
public class Employee_salary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []arr = new double[n];
        double sum = 0.0;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextDouble();
            sum +=arr[i];

        }
        double avg = sum/(double)n;
        for(int i =0;i<n;i++)
        {
            if(arr[i] > avg)
            {
                count++;
            }
        }
        double per = (count/(double)n )* 100.0;


        System.out.println("Total Employees:" +n);
        System.out.println("Average Salary: "+avg);
        System.out.println("Employees Above Average: "+count);
        System.out.println("Percentage: "+per + "%");
    }
}