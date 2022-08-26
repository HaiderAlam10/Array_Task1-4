import java.util.Scanner;

public class TestArray1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements you want?");
        int n=sc.nextInt();
        double[] arr=new double[n];
        System.out.println("Enter "+n+" elements in an array:");
        double sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
            sum+=arr[i];
        }
        System.out.println("Average is:"+sum/n);
    }
}
