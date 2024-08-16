

import java.util.Scanner;

class ArmstrongNumber
{
 public static void main(String[] args) 
 {

 	Scanner sc = new Scanner(System.in);

 	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	int dup = num;               //num should not be zero so we have to take duplicate of num (power become zero so we make dup of num)
	int length = 0;
	int dup1 = num;              //num should not be zero so we have to take duplicate of num (sum become zero so we make another dup of num)
	int sum = 0;

	while(num != 0)
	{
		length++;

		//System.out.println(length);          this is for tracing the program only
        
        num /= 10;

        //System.out.println(num);          this is for tracing the program only
	}

	while(dup>0)
	{
		int rem = dup%10;
	    int power = 1;

	   for(int i=1; i<=length; i++)
	   {
	   	power = power * rem;
	   }

	   sum += power;
	   dup /= 10;
	}

	if(sum == dup1)
	{
		System.out.println("The number is an Armstrong number.");
	}
	else 
	{
	System.out.println("The number is not an Armstrong number.");
    }
 }
}














