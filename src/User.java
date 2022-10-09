import java.util.Scanner;

public class User {
	private String name;
	private int userID;
	private String email;
	private String password;
	
	
	public String getName() {
		return name;
	}

	public int getUserID() {
		return userID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean verifyLogin(Scanner inputemail, Scanner inputpassword){
		return true;
		//return false;
		
	}
	
	private void setPassword(String newPassword) {
		this.password = newPassword;
	}
	
	private void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
}
