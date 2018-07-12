import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		int price,items;
      // try{ 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the container price :");
        price=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of items in the container :");
        
        
        items=Integer.parseInt(br.readLine());
        
        
        try{//when divided by zero , arthematic exception is thrown 
            int average=price/items;
            
            System.out.println("The average price of the item is Rs."+average);
                        
            
        }
        catch(ArithmeticException e){// here we are catching those exception and priniting them the way we want
            System.out.println("Exception : java.lang.ArithmeticException");
        }
        
        
        
	}

}

