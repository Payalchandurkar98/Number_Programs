//Write a program to print first 20 numbers in Fibonacci Series

import java.util.Scanner;

class FibonacciSeries
{
  public static void main(String[] args) {

  	int num1 = 0;
  	int num2 = 1;

  	System.out.print(num1 + " " + num2 + " ");

  	for(int i=1; i<=8; i++)                  //1st two numbers already initialized above thats why here we take 8 i.e. (10-2)
  	{
  		int op = num1 + num2;
  		System.out.print(op+ " ");

  		num1 = num2;
  		num2 = op;
  	}
  }
}
