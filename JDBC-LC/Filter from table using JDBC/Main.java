import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the weight to filter:");
//fill code here.
        Float userWg = Float.parseFloat(br.readLine());
    CargoDAO dao=new CargoDAO();
List<Cargo> cargoList = dao.filterCargoByWeight(userWg);
       
       
        if(cargoList.size() == 0)
            System.out.println("No cargo found");
        else
        {
           System.out.format("%-15s %-25s %-15s %-15s %s\n", "Cargo id","Cargo name","Width","Height","Cargo weight");
    for (Cargo cargo : cargoList) {
                 
System.out.format("%-15s %-25s %-15.2f %-15.2f %.2f\n",cargo.getId(),cargo.getName(),cargo.getWidth(),cargo.getHeight(),cargo.getWeight());
}
        }
    }
}