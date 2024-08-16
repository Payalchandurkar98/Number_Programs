//Write a program to check if the user entered number is EVEN or ODD? Note: If the number is divisible by 2, it is EVEN number. If the number is not divisible by 2 then it is ODD number

import java.util.Scanner;

class EvenOddNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
        double num = sc.nextDouble();



        if(num % 2 == 0)
        {
        	System.out.println("The number is divisible by 2, it is EVEN number.");
        }
        else  
        {
        	System.out.println("The number is not divisible by 2,  it is ODD number.");
        }
   }
}