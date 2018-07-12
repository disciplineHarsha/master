import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShipmentBO {
    
    File file1;
	File file2;
	List<Shipment> list=new ArrayList<Shipment>();
	
	public List<Shipment> readShipmentDetails(String fileName) throws IOException, NumberFormatException, ParseException{
		Shipment ship=new Shipment();
		file1=new File(fileName);
		
		BufferedReader br=new BufferedReader(new FileReader(file1));
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d=new Date();
		sdf.format(d);
		
		
		String line;
		
		while((line=br.readLine())!=null){
			String[] s=line.split(",");
			ship.setId(Long.valueOf(s[0]));
			ship.setBookingNumber(s[1]);
			d=sdf.parse(s[2]);
			ship.setDepartureDate(d);
			d=sdf.parse(s[3]);
			ship.setArrivalDate(d);
			ship.setTotalWeight(Integer.parseInt(s[4]));
			ship.setStatus(s[5]);
			
			
			
			list.add(new Shipment(ship.getId(),ship.getBookingNumber(),ship.getDepartureDate(),ship.getArrivalDate(),ship.getTotalWeight(),ship.getStatus()));
			
		}
	
		
		
		return list;
	}
	
	
	 public List<Shipment> filterByStatus(List<Shipment> shipmentList,String status){
		 
		 List<Shipment> statusList=new ArrayList<Shipment>();
		 Iterator<Shipment> ite=shipmentList.iterator();

		 while(ite.hasNext()){
			 Shipment shipment=(Shipment) ite.next();
			 if(shipment.getStatus().equalsIgnoreCase(status)){
				 
				 statusList.add(shipment);
			 }
		 }
		 
		 
		 
		return statusList; 
	 }
	 
	 
	 
	 
		public void saveShipments(List<Shipment> shipmentList,String outputfile) throws IOException{
			
		file2 =new File(outputfile);
		BufferedWriter bw=new BufferedWriter(new FileWriter(file2));
		String status=null;
		Iterator<Shipment> ite=shipmentList.iterator();
		
		while(ite.hasNext()){
			 Shipment shipment=(Shipment) ite.next();
			
			 bw.write(shipment.toString());
             if(ite.hasNext()){
                bw.newLine();
             }
			 
			
			
		}
			
            System.out.println("There are "+shipmentList.size()+" in "+status+" status");
            
			bw.flush();
			bw.close();
			
			
		}
	
	
	   
	
	

}
