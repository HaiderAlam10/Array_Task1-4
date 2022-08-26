import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    static ArrayList <Integer> nums=new ArrayList<>();
    static int total;
    public static void main(String[] args) {
        // sum of integers in an arraylist
        //create a for loop to get the users input
        for (int i = 0; i <= 9; i++) {
            System.out.println("Enter a number: ");
            int num = new Scanner(System.in).nextInt();
            nums.add(num);
            //nextInt() because we're working with integers
            }
        // for loop to add integer
        for (int j=0; j < nums.size(); j++) {
        total+= nums.get(j);
    }
    //print sum
    System.out.println("your sum is "+total);

    }
}

