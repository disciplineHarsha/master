import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[])throws Exception{
	
		Scanner sc = new Scanner(System.in);
    	Shipment es = new Shipment();

		System.out.println("Enter the number of shipments :");
		int np = sc.nextInt();
		Shipment[] s = new Shipment[np];

		sc.nextLine();
		for (int i = 0; i < np; i++) {

			System.out.println("Enter the shipment " + (i+1) + " details");

			System.out.println("Enter the shipper name :");
			// String name = sc.nextLine();
			es.setShipperName(sc.nextLine());

			System.out.println("Enter the mode of transportation :");
			// String mt = sc.nextLine();
			es.setModeOfTransportation(sc.nextLine());
			System.out.println("Enter the total weight :");
			// float wg = sc.nextFloat();
			es.setTotalWeight(sc.nextFloat());
			sc.nextLine();
			System.out.println("Enter the arrival port :");
			// String ap = sc.nextLine();
			es.setArrivalPort(sc.nextLine());
			System.out.println("Enter the departure port :");
			// String dp = sc.nextLine();
			es.setDeparturePort(sc.nextLine());

			// s[i]=Shipment.createNewShipment(name, mt, wg, ap, dp);
            try{
			    s[i] = Shipment.createNewShipment(es.getShipperName(), es.getModeOfTransportation(), es.getTotalWeight(),
					es.getArrivalPort(), es.getDeparturePort());
            }
            catch(Exception e){
                
            }
		}
		
		System.out.println("Shipment details are");
		System.out.format("%-15s%-15s%-25s%-15s%-20s%s\n", "Id", "Shippername", "Mode of transportation",
				"Total weight", "Arrival port", "Departure port");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		sc.close();

    
	}    
}
