import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ShipmentEntity shipmentEntity = null;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        CustomerShipment agent = new CustomerShipment();
    	CompanyShipment company = new CompanyShipment();
        
            
		System.out.println("1. Customer Shipment\n2. Company Shipment\nEnter your choice :");
		Integer choice = Integer.parseInt(buf.readLine());
		if(choice <= 2){
			System.out.println("Enter the name :");
			String name = buf.readLine();
			System.out.println("Enter the weight :");
			Double weight = Double.parseDouble(buf.readLine());
			System.out.println("Enter the quantity :");
			Integer quantity = Integer.parseInt(buf.readLine());
			System.out.println("Enter the shipment transfer cost :");
			Double transferCost = Double.parseDouble(buf.readLine());
			System.out.println("Enter the maximum shipment capacity :");
			Double maxShipmentCapacity = Double.parseDouble(buf.readLine());
			switch(choice) {
				case 1:System.out.println("Enter the referal fee :");
					   Double referal = Double.parseDouble(buf.readLine());
    			agent.setName(name);
				agent.setWeight(weight);
				agent.setQuantity(quantity);
				agent.setTransferCost(transferCost);
				agent.setMaxShipmentCapacity(maxShipmentCapacity);
				agent.setReferalFee(referal);

				shipmentEntity = new CustomerShipment(agent.getName(), agent.getWeight(), agent.getQuantity(),
						agent.getTransferCost(), agent.getMaxShipmentCapacity(), agent.getReferalFee());

				shipmentEntity.calculateCost();
				shipmentEntity.operatingCapacity();
				break;
				case 2:System.out.println("Enter the tax percentage:");
					   Integer tax = Integer.parseInt(buf.readLine());
    			company.setName(name);
				company.setWeight(weight);
				company.setQuantity(quantity);
				company.setTransferCost(transferCost);
				company.setMaxShipmentCapacity(maxShipmentCapacity);
				company.setTax(tax);

				shipmentEntity = new CompanyShipment(company.getName(), company.getWeight(), company.getQuantity(),
						company.getTransferCost(), company.getMaxShipmentCapacity(), company.getTax());
				shipmentEntity.calculateCost();
				shipmentEntity.operatingCapacity();
                break;
			}
			   //fill the code
		}
		else{
			System.out.println("Invalid Input");
		}
	}

}