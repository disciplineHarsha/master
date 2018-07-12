import java.io.*;
public class Main {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String word;
        String value;
        System.out.println("Enter the file content:");
        word=br.readLine();
        
        System.out.println("Enter the virus keyword:");
        value=br.readLine();
        
        if(word.trim().contains(value.trim())){
            System.out.println("Virus "+value.trim()+" is present");
        }
        else{
            System.out.println("Virus "+value.trim()+" is not present");
        }
		
	}
}

