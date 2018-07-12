import java.io.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws Exception {
        String name,source,destination;
        double price;
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the shipment name :");
        name = br.readLine();
        System.out.println("Enter the source :");
        source = br.readLine();
        System.out.println("Enter the destination :");
        destination = br.readLine();
        System.out.println("Enter the price :");
        price =Double.parseDouble(br.readLine());
        System.out.println("1. Agent\n2. Company\nEnter your choice :");
        choice = Integer.parseInt(br.readLine());
        Shipment shipment;
        DecimalFormat df = new DecimalFormat("#.00");
        
        AgentShipment agent=new AgentShipment();
        CompanyShipment company = new CompanyShipment();
        if(choice == 1)
        {
            double referalFee;
            System.out.println("Enter the referal fee :");
            referalFee = Double.parseDouble(br.readLine());
            System.out.println("Agent details :");
			agent.setName(name);
    		agent.setSource(source);
			agent.setDestination(destination);
			agent.setPrice(price);
			agent.setReferalFee(referalFee);
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
			System.out.printf("%-15s %-15s %-15s%s\n",agent.getName(),agent.getSource(),agent.getDestination(),df.format(agent.calculateShipmentAmount()));
        }
        else if(choice == 2)
        {
            double luxuryTax,corporateTax;
            System.out.println("Enter the luxury tax and corporate tax:");
            luxuryTax = Double.parseDouble(br.readLine());
            corporateTax = Double.parseDouble(br.readLine());
            System.out.println("Company details :");
		company.setName(name);
            company.setSource(source);
            company.setDestination(destination);
            company.setPrice(price);
            company.setLuxuryTax(luxuryTax);
            company.setCorporateTax(corporateTax);
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
			System.out.printf("%-15s %-15s %-15s%s\n",company.getName(),company.getSource(),company.getDestination(),df.format(company.calculateShipmentAmount()));
        }
    }
    
}
