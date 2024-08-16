


import java.util.Scanner;

class KrishnamurthyNumber
{
 public static void main(String[] args) {
 	
 	Scanner sc = new Scanner(System.in);

 	System.out.print("Enter a number: ");
 	int num = sc.nextInt();
  
   
 	int sum = 0;
 	int dup = num;
    
 	while(dup != 0)
 	{
 		int rem = dup%10;
 		int fact = 1;

 		for(int i=1; i<=rem; i++)
 			fact *= i;

 		sum += fact;
 		dup/=10;

 	}


 	System.out.println((sum==num)?num+" is a Krishnamurthy Number.":num+" is not a Krishnamurthy Number.");
 }
}


