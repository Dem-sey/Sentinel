import java.util.Scanner;

public class try4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total = 0;
        int count = 0;

        System.out.print("enter the amount(0 to stop):");
        amount = input.nextInt();// next input

        while (amount != 0) {
            total += amount;
            count++;

            System.out.print("enter the amount(0 to stop):");
            amount = input.nextInt();// next input

        }
        System.out.println("The total amount spent = " + total);
        System.out.println("the number of item= " + count);
        input.close();

    }

}