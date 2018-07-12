import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the number of shipments:");
		int n=Integer.parseInt(br.readLine());
		String sameDay;
		
		System.out.println("Enter the shipment details:");
		
		
		String[] shipmentDetails=new String[n];
		
		for(int i=0;i<n;i++){
			shipmentDetails[i]=br.readLine();
		}
		
		System.out.println("Shipments that are arrived on same day:");
		
		for(int i=0;i<shipmentDetails.length;i++){
			String[] split=shipmentDetails[i].split(",");
			
			if(split[1].compareTo(split[2])==0){
				
				System.out.println(split[0]);
			}
		}
		
		// fill the code
	}
}

