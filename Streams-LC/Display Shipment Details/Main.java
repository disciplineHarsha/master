import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

    public static List<String> readFileInList(String fileName) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);//why buffereader is not used here ?
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public static void writeToFile(String content) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("output.txt");
			bw = new BufferedWriter(fw);
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws ParseException {
		//Read the input each as string and add into list
		//shipmentId,bookingNumber,departureDate,arrivalDate,totalWeight,carrierId,name,code
		List<String> lines = readFileInList("input.txt");
		
		//Have a list of carrier object
		List<Carrier> carrierList = new ArrayList<Carrier>();
		//Read each row/line of the list prepared from the input text
		for(int i = 0; i < lines.size(); i++) {
			//since the input is comma separated split the string with it
			String[] inputs = lines.get(i).split(",");
			
			Long carrierId = Long.valueOf(inputs[7]);//why not parsing here ?
			String carrierName = inputs[5];//why setters are not used here to set values why directly we are storing it in 
			String carrierCode = inputs[6];
			
			Long shippingId = Long.valueOf(inputs[0]);
			String bookingNumber = inputs[1];
			String departureDate = inputs[2]; //taking here date as simple string, if taken as Date need to do apply some logic to convert string to date
			String arrivalDate = inputs[3];
			Integer totalWeight = Integer.valueOf(inputs[4].trim());
			
			//Check if the carrierList object already has the carrier details - stream used here is java 1.8 feature
			boolean carrierExists = carrierList.stream().anyMatch(item -> carrierName.equals(item.getName()));
			
			//If carrier already exists then get the existing shipment list and add the new shipment details
			//else create new carrier object, shipment list and add to the carrier list
			if(carrierExists) {
				for(int j = 0; j < carrierList.size(); j++) {
					if(carrierName.equals(carrierList.get(j).getName())) {
						List<Shipment> shipmentList = carrierList.get(j).getShipmentList();
						Shipment shipment = new Shipment(shippingId, bookingNumber, departureDate, arrivalDate, totalWeight);
						shipmentList.add(shipment);
					}
				}
			} else {
			 	Shipment shipment = new Shipment(shippingId, bookingNumber, departureDate, arrivalDate, totalWeight);
				List<Shipment> shipmentList = new ArrayList<Shipment>();
				shipmentList.add(shipment);
				Carrier carrier = new Carrier(carrierId, carrierName, carrierCode, shipmentList);
				carrierList.add(carrier);
			}
		}
		
		
		StringBuilder output = new StringBuilder();
		//Sort outer carrier list using comparable method
		Collections.sort(carrierList); //Link to understand sorting list of objects here https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
		for(int k = 0; k < carrierList.size(); k++) {
		//	System.out.println(carrierList.get(k).toString());
			output.append(carrierList.get(k).toString()); //Add each set of string to stringbuilder which going to be written in output file
			output.append("\n");
			List<Shipment> shipList = carrierList.get(k).getShipmentList();
			//Sort inner shipment list using comparable method
			Collections.sort(shipList);
			for(int l = 0; l < shipList.size(); l++) {
				//System.out.println(shipList.get(l).toString());
				output.append(shipList.get(l).toString());
				output.append("\n");
			}
		}
		
		//Write to file
		writeToFile(output.toString());
	}

}
