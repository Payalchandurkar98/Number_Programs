
import java.util.Scanner;

class AutomorphicNumber
{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
  	int num = sc.nextInt();

  	int dup = num;
  	int sqr = num * num;
  	int div = 1;

  	while(num != 0)
  	{
  		div *= 10;
  		num/=10;
  	}

    int ld = sqr%div;
  	System.out.println(dup==ld?dup+" is an Automorphic number.":dup+" is not an Automorphic number.");
	}
}