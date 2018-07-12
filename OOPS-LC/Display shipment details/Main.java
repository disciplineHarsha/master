import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ShipmentStatus shipmentStatus = new ShipmentStatus();
		Shipment shipment = new Shipment();
		ShipmentBO shipmentbo=new ShipmentBO();

		System.out.println("Enter the number of shipment");
		int n = Integer.parseInt(br.readLine());
		Shipment[] shipmentArray = new Shipment[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Shipment " + (i + 1) + " details");
			String details = br.readLine();
			String[] det = details.split(",");

			shipment.setId(Integer.parseInt(det[0]));
			shipment.setName(det[1]);
			shipment.setArrivalPort(det[2]);
			shipment.setDeparturePort(det[3]);
			shipmentStatus.setCode(det[4]);
			shipmentStatus.setName(det[5]);
			ShipmentStatus shipment1 = new ShipmentStatus(shipmentStatus.getCode(), shipmentStatus.getName());
			shipment.setStatus(shipment1);

			shipmentArray[i] = new Shipment(shipment.getId(), shipment.getName(), shipment.getArrivalPort(),
					shipment.getDeparturePort(), shipment.getStatus());

		}
		
		System.out.println("Enter the type to display the data (JSON/CSV)");
		String type=br.readLine();
		
		if(type.equalsIgnoreCase("json")){
			    System.out.println("JSON Data:");
				shipmentbo.convertToJSON(shipmentArray);
			
		}
		else if(type.equalsIgnoreCase("csv")){
            System.out.println("CSV Data:");
			shipmentbo.convertToCSV(shipmentArray);
		}

	}

}
