package bookshomework;

import java.util.Scanner;

public class BookTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Declaring books type and name and creating book objects
		Book b = new Book();
			
			System.out.println("Enter the Title of Book B: ");
			String temp = input.nextLine();
			b.setTitle(temp);
			b.saying();
		
		Book c = new Book();
		
			System.out.println("\nEnter the Title of Book C: ");
			String temp2 = input.nextLine();
			c.setTitle(temp2);
			c.saying();
			
		
		
	}

}
