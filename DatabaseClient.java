import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseClient {
	
	public static void purchaseApplication(Scanner in) {
		String email, appName;
		PreparedStatement p = null;
		PreparedStatement dbFetchResults = null;
		PreparedStatement dbDeleteScreens = null;
		
		System.out.print("Enter the email address of the purchasing account: ");
		email = in.nextLine();
		System.out.print("Enter the name of the application you wish to purchase: ");
		appName = in.nextLine();
		
		
	}
	
	public static void findTopRatedApplications(Scanner in) {
			
	}
	
	public static void makeApplicationSale(Scanner in) {
		
	}
	
	public static void findUserPostings(Scanner in) {
		
	}
	
	public static void findGameAchievementScore(Scanner in) {
		
	}

	public static void main(String[] args) {
		boolean done = false;
		while(!done) {
			System.out.println("MAIN MENU");
			System.out.println("------------------------------------------------------------------");
			System.out.println("1. Purchase an application for a user.");
			System.out.println("2. Find applications with an average rating above a given minimum.");
			System.out.println("3. Set a sale on an application.");
			System.out.println("4. Find all screenshots and reviews left by a user.");
			System.out.println("5. Get a user's total achievement score for a given game.");
			System.out.println("6. Quit");
			System.out.print("Your Selection: ");
			Scanner in = new Scanner(System.in);
			int inVal = in.nextInt();
			switch(inVal) {
				case 1:
					purchaseApplication(in);
					break;
				case 2:
					findTopRatedApplications(in);
					break;
				case 3:
					makeApplicationSale(in);
					break;
				case 4:
					findUserPostings(in);
					break;
				case 5:
					findGameAchievementScore(in);
					break;
				case 6:
					done = true;
					break;
				default:
					System.out.println(inVal + " is not a valid option.");
			}
		}
		System.out.println("EXITING...");
	}

}
