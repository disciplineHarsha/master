import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException  {
		//BufferedReader read=new BufferedReader(new FileInputStream(file1));//this is not possible because BuffereReader(Reader in) and FileReader will read the file which is sub class of InputStreamReader which is subclass of Reader class
		//FileInputStream file=new FileInputStream(file1);//Opening connection to actual file 
		//BufferedInputStream br=new BufferedInputStream(file);//this also we cant use since we have to have DataInputStream and method readLine() is depricated 
		
		
		ShipmentBO sbo=new ShipmentBO();
		List<Commodity> list=sbo.readCommodity("input.txt");
		
		
		sbo.checkCommodity(list);
	
		
		
	}

}
