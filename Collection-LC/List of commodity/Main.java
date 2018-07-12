import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String args[])throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of commodities:");
		
		int n=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the commodity details");
		
		Commodity[] cd=new Commodity[n];
		Commodity cb=new Commodity();
		
		List<Commodity> co=new ArrayList<Commodity>();
		
		
		for(int i=0;i<n;i++){
			
			String s=br.readLine();
			
			String[] sd=s.split(",");
			cb.setCommodityName(sd[0]);
			cb.setQuantity(sd[1]);
			cb.setTotalvalue(sd[2]);
			cb.setTotalWeight(sd[3]);
            
            if(sd[4].equalsIgnoreCase("False")){
    			String replace=sd[4].replaceAll("False", "No");
				cb.setHazardous(replace);
			}
			else if(sd[4].equalsIgnoreCase("True")){
				
				cb.setHazardous(sd[4].replaceAll("True", "Yes"));
			}
            
            
            
			//cb.setHazardous(sd[4]);
			
			cd[i]=new Commodity(cb.getCommodityName(),cb.getQuantity(),cb.getTotalvalue(),cb.getTotalWeight(),cb.getHazardous());
			
			co.add(cd[i]);
		}
		
		
		
		System.out.println("Commodity details are:");
		System.out.format("%-15s%-15s%-15s%-15s%s", "Commodity Name","Quantity","Total Value","TotalWeight","Hazardous");
		System.out.println();
		
		Iterator<Commodity> it=co.iterator();
		
		for(;it.hasNext();){
			
			Commodity c=it.next();
			System.out.println(c);
			
		}
	}
}
