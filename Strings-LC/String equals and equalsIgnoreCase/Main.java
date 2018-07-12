import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the document 1 content:");
		String doc1=br.readLine();
		
		System.out.println("Enter the document 2 content:");
		String doc2=br.readLine();
		 
		if(doc1.contains(" ") && (!doc2.contains(" "))){//checking if string contains spaces or not 
			String removedSpace=doc1.replaceAll("\\s","");
			
			if(removedSpace.equalsIgnoreCase(doc2)){
				System.out.println("Orange");
			}
		}
		else if(doc1.contains(" ") && (doc2.contains(" "))){
			
			if(doc1.equals(doc2)){
				System.out.println("Green");
			}
			else if (doc1.equalsIgnoreCase(doc2)){
				System.out.println("Blue");
			}
			
			else if(!(doc1.equals(doc2))){
				System.out.println("Red");
			}
		}	
	}

}
