


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShippingCostThread extends Thread  {

    private List<Cargo> cargoList;
    private List<Double> priceList;
    
    
    
   public ShippingCostThread(List<Cargo> cargoList){
        this.cargoList=cargoList;
    }
    
    public void run() {
       Iterator<Cargo> ite=this.cargoList.iterator();
      // System.out.println("Inside run method : "+cargoList);
       priceList=new ArrayList<Double>();
       while(ite.hasNext()){
    	   
    	   Cargo c=ite.next();
    	//   System.out.println("Insie iteratore : "+ c);
    	   if(c.getStorageType().equalsIgnoreCase(Cargo.getDRY_STORAGE())){
      		 
      		 priceList.add(c.getWeight()*0.90);
      	   }
      	   else if(c.getStorageType().equalsIgnoreCase(Cargo.getCOLD_STORAGE())){
      		
        		 priceList.add(c.getWeight()*1.85);
        	   }
    	    
    	   
       }
       Main.displayPrice(priceList);
    }
    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }


    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }
    
}
