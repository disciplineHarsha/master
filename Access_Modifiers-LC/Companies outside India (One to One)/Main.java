import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
       
    	
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		Company co=new Company();
		Address ad= new Address();
		CompanyBO cbo=new CompanyBO();
		
		System.out.println("Enter the number of companies :");
		int nc=Integer.parseInt(bf.readLine());
		
		
		Company[] c=new Company[nc];
		
		for(int i=0;i<nc;i++){
			//System.out.println("Enter the company details :");
			
			System.out.println("Enter the company " +(i+1)+ " details :");
			
			
			System.out.println("Enter company id :");
			co.setIdentifier(bf.readLine());
			
			
			System.out.println("Enter the company's IATA code :");
			co.setIata(bf.readLine());
			
			System.out.println("Enter the company's FMC code :");
			co.setFmc(bf.readLine());
		
			System.out.println("Enter the company's state :");
			ad.setState(bf.readLine());
			
			
			System.out.println("Enter the company's country :");
			ad.setCountry(bf.readLine());
			
			
			
			co.setAddress(Address.createAddress(ad.getState(), ad.getCountry()));
			c[i]=co.createNewCompany(co.getIdentifier(), co.getIata(), co.getFmc(), co.getAddress());
		}
        
       
			cbo.displayCompanyDetails(c);
	    	
			
		
	}

}
