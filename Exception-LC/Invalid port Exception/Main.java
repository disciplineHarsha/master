import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String args[])throws IOException{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       ShipmentBO shipmentBo=new ShipmentBO();
       String arrivalPort=null;
       String departurePort=null;
       
	   Port[] port = new Port[4];
	   port[0]=new Port(1,"India","Chennai");
		port[1]=new Port(2,"America","California");
		port[2]=new Port(3,"England","London");
		port[3]=new Port(4,"Australia","Melbourne");
	   Shipment shipment=new Shipment();
	   
	   System.out.println("Enter the Shipment Id ");
       int id=Integer.parseInt(br.readLine());
	   shipment.setId(id);
	   System.out.println("Enter the Shipment Name ");
       String name=br.readLine();
	   shipment.setName(name);
	   System.out.println("Available ports are");
	   System.out.format("%-15s %-15s %s","ID","Country","PortName");
	   for(int i=0;i<port.length;i++)
	   {
		   System.out.format("\n%-15s %-15s %s",port[i].getId(),port[i].getCountry(),port[i].getName());
	   }
	   System.out.println();
       System.out.println("Enter the arrival port name");   
	   arrivalPort=br.readLine();
	   	   
	   for(int i=0;i<port.length;i++){
          if(port[i].getName().equalsIgnoreCase(arrivalPort)){
    			  shipment.setArrivalport(port[i]);
    		  }
          
		   
	  }
	   
	   System.out.println("Enter the departure port name");
	   departurePort=br.readLine();
	   for(int i=0;i<port.length;i++){
		   if(port[i].getName().equalsIgnoreCase(departurePort)){
			   shipment.setDepartureport(port[i]);
		   }
	   }
	   
     
        
	   try {//either add try catch block or put throw invalidPortException
            if(arrivalPort!=null||departurePort!=null)
            if(shipmentBo.validateShipment(arrivalPort, departurePort, port)){//mandatory to throw invalidPortException here
                    System.out.println("Shipment Details :");
        			System.out.format("%-15s %-15s %-15s %-15s\n", "Shipment id", "Shipment name", "Arrival place", "Departure place");
        			shipmentBo.displayShipmentDetails(shipment, port, arrivalPort, departurePort);
        		 }
	   } 
      catch (InvalidPortException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();	
		    System.out.println("InvalidPortException: "+e.getMessage());
		
	   }
     
   }
}
