import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the generated booking id");
		
		String word=sc.nextLine();
		
		
		
		if(word.matches(".*[a-zA-Z].*"))
		{
			System.out.println("Generated booking id is not valid");
		}
		else{
            
			System.out.println("Generated booking id is valid");
		}
	}
}

