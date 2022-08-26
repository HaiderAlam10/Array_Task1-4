import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Search for integer value in Array: ");
        int find=sc.nextInt();

        boolean check = false;

        for(int element: arr){
            if (element == find){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Value "+find+" found in array");
        }
        else{
            System.out.println("Value was not found in array");
        }
    }
}
