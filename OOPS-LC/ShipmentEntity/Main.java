
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		int choice;
		String details;
		String[] s;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of shipment entity");
		n = Integer.parseInt(br.readLine());

		Customer[] customer = new Customer[n];
		Company[] company = new Company[n];
		Agent[] agent = new Agent[n];
		Carrier[] carrier = new Carrier[n];
		
		
		

		for (int i = 0; i < n; i++) {
			customer[i] = new Customer();

			System.out.println("Enter the shipment entity " + (i + 1) + " details :");
			System.out.println("Select the shipment entity type\n1)Customer\n2)Company\n3)Agent\n4)Carrier");
			choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				
				customer[i] = new Customer();
				details = br.readLine();

				s = details.split(",");
				customer[i].setShipmentEntityName(s[0]);
				customer[i].setIdentificationNumber(s[1]);
				customer[i].setId(Integer.parseInt(s[2]));
				customer[i].setName(s[3]);

				customer[i] = new Customer(customer[i].getShipmentEntityName(), customer[i].getIdentificationNumber(),
						customer[i].getId(), customer[i].getName());

			} else if (choice == 2) {
				company[i] = new Company();
				details = br.readLine();
				s = details.split(",");

				company[i].setShipmentEntityName(s[0]);
				company[i].setIdentificationNumber(s[1]);
				company[i].setIdentifier(s[2]);
				company[i].setIata(s[3]);
				company[i].setFmc(s[4]);

				company[i] = new Company(company[i].getShipmentEntityName(), company[i].getIdentificationNumber(),
						company[i].getIdentifier(), company[i].getIata(), company[i].getFmc());

			}
			
			else if (choice == 3) {
				agent[i] = new Agent();
				details = br.readLine();
				s = details.split(",");

				agent[i].setShipmentEntityName(s[0]);
				agent[i].setIdentificationNumber(s[1]);
				agent[i].setName(s[2]);
				agent[i].setIata(s[3]);
				agent[i].setFmc(s[4]);

				agent[i] = new Agent(agent[i].getShipmentEntityName(), agent[i].getIdentificationNumber(),
						agent[i].getName(), agent[i].getIata(), agent[i].getFmc());

			}
			else if (choice == 4) {
				carrier[i] = new Carrier();
				details = br.readLine();
				s = details.split(",");

				carrier[i].setShipmentEntityName(s[0]);
				carrier[i].setIdentificationNumber(s[1]);
				carrier[i].setCarrierCode(s[2]);
				carrier[i].setIata(s[3]);
				

				carrier[i] = new Carrier(carrier[i].getShipmentEntityName(), carrier[i].getIdentificationNumber(),
						carrier[i].getCarrierCode(), carrier[i].getIata());

			}
		}
		
		
		System.out.println("Shipment details are\nEnter the shipment entity type to display");
		String type=br.readLine();
		
		if(type.equalsIgnoreCase("Customer")){
			System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");
			for(int i=0;i<customer.length;i++){
				try{
    				if(customer[i].getShipmentEntityName()!=null){
						//System.out.println(customer[i]);
						customer[i].display();
					}
				}catch(Exception e){
					
				}
			}
		}
		else if(type.equalsIgnoreCase("Company")){
    		System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");
    		for(int i=0;i<company.length;i++){
    			try{
    				if(company[i].getShipmentEntityName()!=null){
						//System.out.println(company[i]);
						company[i].display();
					}
				}catch(Exception e){
					
				}	
    		}
		}
		else if(type.equalsIgnoreCase("Agent")){
			System.out.format("%-15s %-25s %-15s %-15s %-15s\n", "Name", "Identification Number ", "Agent Name", "IATA","FMC");
			for(int i=0;i<agent.length;i++){
				try{
    				if(agent[i].getShipmentEntityName()!="null"){
						//System.out.println(agent[i]);
						agent[i].display();
					}
				}catch(Exception e){
					
				}
			}
		}
		
		else if(type.equalsIgnoreCase("carrier")){
			System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");
			for(int i=0;i<carrier.length;i++){
				try{
    				if(carrier[i].getShipmentEntityName()!=null){
						//System.out.println(carrier[i]);
						carrier[i].display();
					}
				}catch(Exception e){
					
				}	
			}
		}
		

	}

}
