//Write a Java program to check whether input number is prime or not

package primeornot;
import java.util.Scanner;
public class PrimeorNot {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i,flag = 0;
		for (i=2; i<=num/2; i++) {
			if (num%i==0) {
				System.out.println("The number " + num + " is not a prime number");
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("The number " + num + " is a prime number");
		}
		
		
	}

}
