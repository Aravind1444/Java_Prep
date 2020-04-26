//Write a Java program to display odd numbers from 1 to 50

public class oddnumbers {
	public static void main(String[] args) {
		System.out.println("The odd numbers from 1 to 50 are : ");
		int a;
		for (a=1;a<50;a++) {
			if (a%2 != 0) {
				System.out.println(a);
			}
		}
		
	}

}
