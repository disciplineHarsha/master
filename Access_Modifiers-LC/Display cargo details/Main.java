
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        Cargo cargoObject=new Cargo();
        
        
        System.out.println("Enter the cargo details:");
        System.out.println("Enter the name");
        String name=sc.nextLine();
        cargoObject.setName(name);
        
        System.out.println("Enter the description");
        String des=sc.nextLine();
        cargoObject.setDescription(des);
        
        
        System.out.println("Enter the length");
        cargoObject.setLength(sc.nextDouble());
        
        System.out.println("Enter the width");
        cargoObject.setWidth(sc.nextDouble());
        
        System.out.println("The cargo details are:");
        cargoObject.displayCargoDetails();
        
        
        
        
        
        
	}

}
