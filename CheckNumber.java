//Write a program to check if the user given number is POSITIVE, NEGATIVE or Neutral(NATURAL NUMBER)

import java.util.Scanner;

class CheckNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (num < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is NEUTRAL.");
        }
     }
}

    

