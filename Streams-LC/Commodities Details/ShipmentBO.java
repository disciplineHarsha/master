import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShipmentBO {
    
	
	
	public List<Commodity> readCommodity(String fileName) throws NumberFormatException, IOException{
		Commodity c=new Commodity();
		File file1=new File(fileName);
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		List<Commodity> listComm=new ArrayList<Commodity>();
		try{
		for(String s;(s=br.readLine())!=null;){
			String[] commodity=s.split(",");
			
			c.setCommodityId(Long.parseLong(commodity[0]));
			c.setWeight(Double.parseDouble(commodity[1]));
			c.setQuantity(Integer.parseInt(commodity[2]));
			Boolean b=Integer.parseInt(commodity[3]) != 0;
			c.setHazardous((b));
			c.setContainerId(Long.parseLong(commodity[4]));
			
			listComm.add(new Commodity(c.getCommodityId(),c.getWeight(),c.getQuantity(),c.getHazardous(),c.getContainerId()));
			//System.out.println(listComm.get(0).getCommodityId());
		}
		}
		catch(NumberFormatException e){
			
		}
		
		return listComm; 
	}
	
	
	public void checkCommodity(List<Commodity> commodityList){
			Double totalWeight=0.0;
			int totalquantity=0;
			Boolean c=false;
		for(int i=0;i<commodityList.size();i++){
			totalWeight=totalWeight+commodityList.get(i).getWeight();
			totalquantity=totalquantity+commodityList.get(i).getQuantity();
			/*//b=commodityList.get(i).getHazardous();
			if(commodityList.get(i).getHazardous().toString() != null){
				b=true;
			}*/
			
			if((commodityList.get(i).getHazardous())){
				c=true;
			}
		}
		
		System.out.println("Total Weight :" +totalWeight);
		System.out.println("Total Quantity :"+totalquantity);
		
		if(c){
			System.out.println("Hazardous Commodity Found!");
		}
		
	}

}
