import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipments");
		int n=Integer.parseInt(br.readLine());
		int count=0;
		System.out.println("Enter shipment details");
		String[] details=new String[n];
		Map<Integer,Integer> mymap=new HashMap<Integer,Integer>();
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			details[i]=br.readLine();
		}
		
		for(int i=0;i<n;i++){
			String[] s=details[i].split(",");
			
			
			for(int j=i;j<i+1;j++){
				String[] sec=details[j].split(",");
				
				if((!(s[2].contains(sec[2]))||(!(s[2].contains(sec[3]))))){
					mymap.put(Integer.parseInt(s[2]), null);
					
				}
				if (!(s[3].contains(sec[2]))||(!(s[3].contains(sec[3])))){
					mymap.put(Integer.parseInt(s[3]), null);
				}
			}
			
		}
		
		//System.out.println(mymap);
		for(Integer key:mymap.keySet()){
			for(int i=0;i<n;i++){
				String[] s=details[i].split(",");
				if(key==Integer.parseInt(s[2])||key==Integer.parseInt(s[3])){
					count++;
				}
				
			}
			mymap.put(key, count);
			count=0;
		
			
		}
		//System.out.println(mymap);
		System.out.format("%-15s%-15s\n", "Port id","Number of Shipments");
		
		/*Iterator ite=mymap.keySet().iterator();
		
		while(ite.hasNext()){
			System.out.format("%-15s%-15s\n",ite.next(),mymap.get(ite.next()));
		}
		*/
		
		for(Integer key:mymap.keySet()){
			Integer val=mymap.get(key);
			System.out.format("%-15s%-15s\n",key,val);
			
			
		}
		
	}	
		
}
