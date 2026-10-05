import java.util.Scanner;

public class IT20057138Lab7Q1A {

    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);
        int j = 0;

        while (j < 3){

            double sum = 0;

        System.out.println("Enter 4 subject marks for Student "
             + j + " (separated by spaces):");

        for (int i = 0; i < 4; i++) {

            double num = sc1.nextDouble();

            sum = sum + num;

        }

        System.out.println("Average value is" + sum / 5.0);

        double avg = sum / 5.0;

        if (avg <= 100.0 && avg >= 75.0) {

            System.out.println("Distinction");

        } else if (avg <= 74.0 && avg >= 50.0) {

            System.out.println("Credit");
        } else {

            System.out.println("Fail");
        }

        j++;

    }

}
}
