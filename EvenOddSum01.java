import java.util.Scanner;

public class EvenOddSum01 {

    public static void main(String[] args) {

		String name ="Ashish";

        int x=10;

        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do {
            System.out.println("enter the number:");
            number =sc.nextInt();
            if (number%2==0) {
               evenSum+=number;
            }else{
                oddSum+=number;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice=sc.nextInt();
        } while (choice==1);
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
