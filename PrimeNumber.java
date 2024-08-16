


import java.util.Scanner;

class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean flag = true;

		for(int i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}
		}

		System.out.println(flag? +num +" is a prime number.": +num +" is not a prime number.");
		
	}
}
