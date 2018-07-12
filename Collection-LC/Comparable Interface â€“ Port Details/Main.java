import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String portDetails="null";
		Port p=new Port();
		ArrayList<Port> portList=new ArrayList<Port>();
		String dec=null;
		System.out.println("Enter the port details");
	do{	
		
		portDetails=br.readLine();
		String[] portdetails=portDetails.split(",");
		p.setId(Integer.parseInt(portdetails[0]));
		p.setName(portdetails[1]);
		p.setCountry(portdetails[2]);
		portList.add(new Port(p.getId(),p.getName(),p.getCountry()));
		
		
		System.out.println("Do you want to continue[Yes/No]");
		dec=br.readLine();
	}while(dec.equalsIgnoreCase("yes"));
	
	Collections.sort(portList);
	//Collections.sort(portList,new Port());
	
	
	System.out.println("Port details in sorted order");
	System.out.format("%-16s%-16s%-15s\n","Port Id","Name","Country");
	
	for(int i=0;i<portList.size();i++){
		System.out.println(portList.get(i));
		
	}
	
	
	
		
	}

}
