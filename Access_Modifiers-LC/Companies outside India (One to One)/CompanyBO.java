

public class CompanyBO {
    public void displayCompanyDetails(Company[] company)  {
    	
            boolean flag = false;
            
    		for (int i = 0; i <company.length; i++) {
    			if ((company[i].getAddress().getCountry()).contains("India")) {
    				flag = true;
    
    			} else {
    				flag = false;
    
    			}
    		}
    		if (flag == true) {
    			System.out.println("All companies are inside India");
    		}
    		else if(flag==false){
    			System.out.println("Companies outside India :");
    			System.out.format("%-15s %-15s %-15s %-15s %s\n", "Company ID", "IATA Code", "FMC Code", "State", "Country");
    			for(int i=0;i<company.length;i++){
    				if (!(company[i].getAddress().getCountry()).equalsIgnoreCase("india")) {
    					System.out.print(company[i]);
    				}
    			/*	else{
    					System.out.print(company[i]);
    				}
    				//System.out.println(company[i]);*/
    				
    			}
		    }
    	
        
	}
}
