import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Tax Calculator App");
		System.out.println("-----WELCOME-----");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total person count : ");
		int n = scanner.nextInt();
		
		String names[] = new String[n];
		long salary[] = new long[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Enter the name " + (i+1) + " : ");
			scanner.nextLine();
			names[i] = scanner.nextLine();
			System.out.println("Enter " + names[i] + "'s salary : ");
			salary[i] = scanner.nextLong();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Names with liable taxes");
		System.out.println("-----------------------");
		
		for (int i = 0; i<n; i++) {
			calculateTax(names[i], salary[i]);
		}
	}
	
	public static void calculateTax(String name, long salary) {
		double tax;
		if (salary >= 300000) {
			tax = (salary/100)*20;
		}
		else if (salary >= 100000 && salary <300000) {
			tax = (salary/100)*10;
		}
		else {
			tax = 0;
		}
		
		System.out.println(name + " : " + "Rs " + tax);
		
	}

}
