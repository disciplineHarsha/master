import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of port details");
		int n=Integer.parseInt(br.readLine());
		Port p=new Port();
		System.out.println("Enter the port details");
			
		ArrayList<Port> pl=new ArrayList<Port>();
		//Iterator<Port> it=pl.iterator();
		
		for(int i=0;i<n;i++){
			
			
			String s=br.readLine();
			
			String[] split=s.split(",");
			p.setId(Integer.parseInt(split[0]));
			p.setName(split[1]);
			p.setCity(split[2]);
			
			pl.add(new Port(p.getId(),p.getName(),p.getCity()));		
			
		}
		
		
		
		System.out.format("%-15s %-15s %-15s\n","Port Id","Name","Location");
		
		
		/*for(;it.hasNext();){
			
			Port port=it.next();
			System.out.println(port);
			
		}*/
		
		for(int i=0;i<pl.size();i++){
			System.out.println(pl.get(i));
			
		}
		
		
		System.out.println("Enter the position");
		int position =Integer.parseInt(br.readLine());
		
		System.out.println("Enter port detail to be inserted");
		String newPort=br.readLine();
		
		String[] newP=newPort.split(",");
		p.setId(Integer.parseInt(newP[0]));
		p.setName(newP[1]);
		p.setCity(newP[2]);
		
		Port po=new Port(p.getId(),p.getName(),p.getCity());
		
		pl.add(position-1, po);
		
		System.out.println("After the insertion of port details");
        System.out.format("%-15s %-15s %-15s\n","Port Id","Name","Location");
        
        
		
		/*for(;it.hasNext();){
			
			Port port=it.next();
			System.out.println(port);
			
		}*/
		for(int i=0;i<pl.size();i++){
			System.out.println(pl.get(i));
			
		}
		
		
		
		
	}

}
