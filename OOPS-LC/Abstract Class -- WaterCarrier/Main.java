

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.println("Enter the number of carriers :");
		n = Integer.parseInt(br.readLine());
		
		
	
		WaterCarrier[] wat=new WaterCarrier[n];
		//WaterCarrier[] bulk=null;
		//WaterCarrier[] ferrie=null;
        
		
        

	try{	
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the carrier " + (i + 1) + " details :");
			String details = br.readLine();
			String[] de = details.split(",");
			
			if(de[4].equalsIgnoreCase("ContainerShip")){
				wat[i]=WaterCarrier.createShip(de[0], de[1], de[2], de[3], de[4], Integer.parseInt(de[5]));// static method// accessing// from// class
			}
			else if(de[4].equalsIgnoreCase("BulkShip")){
				//bulk[i]=WaterCarrier.createShip(de[0], de[1], de[2], de[3], de[4], Integer.parseInt(de[5]));
                wat[i]=WaterCarrier.createShip(de[0], de[1], de[2], de[3], de[4], Integer.parseInt(de[5]));
			}
			else {
                //if(de[4].startsWith("Ferry"))
				//ferrie[i]=WaterCarrier.createShip(de[0], de[1], de[2], de[3], de[4], Integer.parseInt(de[5]));
                
                wat[i]=WaterCarrier.createShip(de[0], de[1], de[2], de[3], de[4], Integer.parseInt(de[5]));
			}
			//containerShip[i] = new ContainerShips(de[0], de[1], de[2], de[3], de[4], Integer.parseInt(de[5]));
		}
	}
	catch(Exception e){
		
	
		}
	System.out.println("Ship details are");
	System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n", "Carrier type", "Name", "Code", "IATAcode", "Location",
			"Capacity", "OwnedBy");
	
	
	/*bulk.displayShipDetails();
    wat.displayShipDetails();
	ferrie.displayShipDetails();*/
        for(int i=0;i<n;i++){
            
                /*if(bulk[i]!=null){
            			bulk[i].displayShipDetails();
        			}*/
                           
                   if(wat[i] !=null){
            				wat[i].displayShipDetails();
        			}
        								
        		/*	if(ferrie[i]!=null){
        				ferrie[i].displayShipDetails();
        			}*/
             
              
        }
	}
}
