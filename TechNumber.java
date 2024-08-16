
import java.util.*;

class TechNumber
{
  public static void main(String[] args) {
  	
  	Scanner sc = new Scanner(System.in);

  	System.out.print("Enter a number: ");
  	int num = sc.nextInt();

    int dup = num;
  	int length = 0;

  	while(num != 0)
  	{
  		length++;
  		num/=10;
  	}

  	if(length%2==0)
  	{
  	int div = 1;
  	for(int i=1; i<=length/2; i++)
  	{
  		div *= 10;
  	}

  	int firstHalf = dup/div;
  	int lastHalf = dup%div;

  	int sum = firstHalf + lastHalf;
  	int sqr = sum * sum;

  	System.out.println(dup==sqr?dup+" is a Tech number.":dup+" is not a Tech number.");
    }
     else 
    {
  	System.out.println("A number is not a Tech number.");
    }
  }
}
  