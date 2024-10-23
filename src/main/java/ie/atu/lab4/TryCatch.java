package ie.atu.lab4;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        boolean rightway = true;

            //this is my code to see if else

        try (Scanner scan = new Scanner(System.in)) {

            while (rightway) {
                try {
                    System.out.println("enter a number between 0 - 9: ");

                    String input = scan.nextLine();
                    int myNum = Integer.parseInt(input);

                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("Your number is " + myNum);
                        rightway = false;
                    } else {
                        System.out.println("Invalid input");
                    }
                }

            catch(NumberFormatException Nf){
                    System.out.println("this is invalid " + Nf.getMessage());
                }
            }
        }
    }
}
