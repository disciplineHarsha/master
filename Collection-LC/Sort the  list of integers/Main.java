import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n");
		int n=Integer.parseInt(br.readLine());
		
		MyOwnInteger m=new MyOwnInteger();
		List<MyOwnInteger> ilist=new ArrayList<MyOwnInteger>();
		
		for(int i=0;i<n;i++){
			m.setNumber(Integer.parseInt(br.readLine()));
			ilist.add(new MyOwnInteger(m.getNumber()));
			
		}
		
		
		Collections.sort(ilist);
		
		/*for(int i=0;i<n;i++){
			System.out.println(ilist.get(i));
		}*/
        System.out.println(ilist);
        
	}

}
