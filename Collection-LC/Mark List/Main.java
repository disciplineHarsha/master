import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int count50To70=0;
		int count70To90=0;
		int count90To100=0;
		System.out.println("Enter the number of students");
		int n=Integer.parseInt(br.readLine());
		//dMap<String,Integer> hmap=new HashMap<String,Integer>();
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		for(int i=0;i<n;i++){
			System.out.println("Enter the name of student "+(i+1));
			String name=br.readLine();
			System.out.println("Enter the mark of student "+(i+1));
			int mark=Integer.parseInt(br.readLine());
			
			hmap.put(name, mark);
			
		}
		
		for(Integer entry:hmap.values()){
			if(entry>=0 && entry<=50){
				count++;
				//count+=count;
			}
			else if(entry>50 && entry<=70){
				count50To70++;
				//=count50To70;
			}else if(entry>70 && entry<=90){
				count70To90++;
				//=count70To90;
			}
			else if(entry>90 && entry<=100){
				count90To100++;
				//=count90To100;
			}
		}
		
		System.out.println("0-50 : "+count+"\n"
				+"50-70 : "+count50To70+"\n"
				+"70-90 : "+count70To90+"\n"
				+"90-100 : "+count90To100+"\n");
		
		

	}

}
