import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
    	Scanner sc=new Scanner(System.in);
		ShipmentBO sbo=new ShipmentBO();
		String outputfile="output.txt";
		String inputfile="input.txt";
		
		
		List <Shipment> shipmentList=sbo.readShipmentDetails(inputfile);
		
		System.out.println("Enter the status to be filtered");
		
		String status=sc.nextLine();
		
		List<Shipment> filterList=sbo.filterByStatus(shipmentList, status);
		
		sbo.saveShipments(filterList, outputfile);
		
		
		
		
		

	}

}
