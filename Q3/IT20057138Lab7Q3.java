import java.util.Scanner;

public class IT20057138Lab7Q3 {

    public static void main(String[]args) {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the 5 numbers");

        double sum = 0;
        int i = 0;

        while (i < 4) {

            System.out.println("Enter the total bill amount"+i);

            Scanner sc1 = new Scanner(System.in);

            double amount = sc1.nextDouble();

            System.out.println("enter the mode of payment");

            char c = sc1.next().charAt(0);

            if (c == 'c') {

                System.out.println("Payment mode is cash");
                double discount = amount * 0.05;
                System.out.println("Discount" + discount);
                double payment = amount - discount;
                System.out.println("Total amount" + payment);

            } else if (c == 'o') {

                System.out.println("Payment mode is other");

            } else {
                System.out.println("Payment mode is not valid one");
            }
            i++;

        }

    }
}
