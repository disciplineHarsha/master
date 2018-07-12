import java.io.*;
public class Main {
public static void main(String[] args) throws IOException,ContainerOverloadedException {
    	String cn;
		Float capacity;
		int n;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Container container =new Container();
		ShipmentBO shipment=new ShipmentBO();
        Commodity commodities=new Commodity();
		
		System.out.println("Enter the container number :");
		cn=br.readLine();
		
		System.out.println("Enter the capacity of container :");
		capacity=Float.parseFloat(br.readLine());
		
		System.out.println("Enter the number of commodities :");
		n=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the commodities :");
		
		
		Commodity[] commodity=new Commodity[n];
		String[] comms=new String[n];
		
		for(int i=0;i<commodity.length;i++){
		//	commodity[i]=new Commodity();
			String commdities=br.readLine();
			String[] coms=commdities.split(",");
		/*	commodity[i].setCommodityId(coms[0]);
			commodity[i].setTotalWeight(Float.parseFloat(coms[1]));
			commodity[i].setQuantity(Integer.parseInt(coms[2])); */
			
			//comms[i]=br.readLine();
			
			commodities.setCommodityId(coms[0]);
    		commodities.setTotalWeight(Float.parseFloat(coms[1]));
			commodities.setQuantity(Integer.parseInt(coms[2]));
            
            commodity[i]=new Commodity(commodities.getCommodityId(),commodities.getTotalWeight(),commodities.getQuantity());
		}
		
		
		
		container.setNumber(cn);
		container.setContainerWeight(capacity);
		container.setCommodities(commodity);
		
		try{
			shipment.validate(container, commodity);
            container.displayDetails();
		}
		catch(ContainerOverloadedException e){
			System.out.println("ContainerOverloadedException: "+e.getMessage());
		}
		

	}
}
