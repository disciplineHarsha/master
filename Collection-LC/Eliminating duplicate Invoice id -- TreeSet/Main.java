import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of invoice id :");
		int n=Integer.parseInt(br.readLine());
		
		
		TreeSet<Integer> s=new TreeSet<Integer>();
		System.out.println("Enter the invoice id :");
		
		for(int i=0;i<n;i++){
			s.add(Integer.parseInt(br.readLine()));
		}
		
		
		
		Iterator<Integer> ite=s.iterator();
		System.out.println("Invoice id without duplicate values :");
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}
