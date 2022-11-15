import java.util.Scanner;
import java.util.regex.Pattern;

import in.STechSolution.login.UserLogin;
import in.STechSolution.registration.UserRegistration;
import lombok.Data;

@Data
public class User {
	private String userName;
	private String email;
	private String password;
	private int number;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Pattern pat;
		int choice = 0;

		for (int i = 1; i > 0; i++) {
			System.err.println(
					"Enter your choice to perform operations......press 1: for registration , press2: for login and press 3: for quit....... ");
			choice = scn.nextInt();
			if (choice < 0 || choice > 3)
				System.err.println("Enter a valid choice....!!!");
			else {
				// User Class Obj
				User user1 = new User();

				switch (choice) {
				case 1:
					UserRegistration ur = new UserRegistration();
					System.out.println("_________User Registration_________");
					System.out.println("Enter user name: ");
					user1.userName = scn.next();
					if (user1.userName.isEmpty())
						System.err.print("don't pass empty user name!!!");
					// if(user1.userName)

					System.out.println("Enter email id: ");
					user1.email = scn.next();
					System.out.println("Enter number: ");
					user1.number = scn.nextInt();
					System.out.println("Enter password: ");
					user1.password = scn.next();
					ur.userRegister(user1);
					break;

				case 2:
					// User login class obj
					UserLogin ul = new UserLogin();

					System.out.println("___________User Login___________");
					System.out.println("Enter user name: ");
					user1.userName = scn.next();
					
					System.out.println("Enter password");
					user1.password = scn.next();
					ul.userLogin(user1.userName, user1.password);
					break;

				default:
					System.out.println("Terminating Application!!!");
					System.exit(0);
					break;
				}// switch

			} // for

		} // else

	}

	@Override
	public String toString() {
		return "userName=" + userName + ",\n email=" + email + ",\n password=" + password + ", \nnumber=" + number;
	}// main

}// class
