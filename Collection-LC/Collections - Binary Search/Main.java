import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String shipment="null";
		ShipmentEntity s=new ShipmentEntity();
		List<ShipmentEntity> shipmentList=new ArrayList<ShipmentEntity>();
		String dec=null;
		System.out.println("Enter the shipment entity details");
	do{	
		
		shipment=br.readLine();
		String[] shipmentEntity=shipment.split(",");
		s.setId(Integer.parseInt(shipmentEntity[0]));
		s.setName(shipmentEntity[1]);
		s.setBookingNumber(Integer.parseInt(shipmentEntity[2]));
		shipmentList.add(new ShipmentEntity(s.getId(),s.getName(),s.getBookingNumber()));
		
		
		System.out.println("Do you want to continue [yes/no]");
		dec=br.readLine();
	}while(dec.equalsIgnoreCase("yes"));
		
	Collections.sort(shipmentList);
	//Collections.sort(portList,new Port());
	
	
	System.out.println("After sorting the shipment entity details");
	System.out.format("%-16s%-16s%-15s\n","Id","Name","Number");
	
	for(int i=0;i<shipmentList.size();i++){
		System.out.println(shipmentList.get(i));
		
	}
	
	System.out.println("Enter the shipment entity details to be searched");
	String search=br.readLine();
	String[] sArray=search.split(",");
	ShipmentEntity so=new ShipmentEntity(Integer.parseInt(sArray[0]),sArray[1],Integer.parseInt(sArray[2]));
	
	int index=Collections.binarySearch(shipmentList,so );
	
	System.out.println("Shipment entity found in index : "+(index));
	
	
	
	
	

	}

}
