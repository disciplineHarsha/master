import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String email;
		System.out.println("Enter the email id");

		email = br.readLine();

		String[] emailId = email.split("@");
		/*if (emailId[1].substring(6).equalsIgnoreCase("com") || emailId[1].substring(6).equalsIgnoreCase("org")
				|| emailId[1].substring(6).equalsIgnoreCase("biz")
				|| emailId[1].substring(6).equalsIgnoreCase("net")) {
			
			System.out.println("Valid domain");

		}
		else{
			System.out.println("Not a valid domain");
		}*/
        if ((email.substring(email.length() - 3).equals("com")) || (email.substring(email.length() - 3).equals("org"))
    			|| (email.substring(email.length() - 3).equals("biz"))|| (email.substring(email.length() - 3).equals("net"))) {
			
			System.out.println("Valid domain");

		}
		else
		{ 
			System.out.println("Not a valid domain");
		}

	}

}
