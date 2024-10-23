package ie.atu.lab4;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = null;


            //this is my code to see if else
            scan = new Scanner(System.in);
            System.out.println("enter a number between 0 - 9: ");
            String input = scan.nextLine();
            int myNum = Integer.parseInt(input);
            if (myNum >= 0 && myNum <= 9) {
                System.out.println("Your number is " + myNum);
            }
            else{
                System.out.println("Invalid input");
            }


    }
}
