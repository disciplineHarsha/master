import java.io.*;
public class Main 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
	    int number=0;
        int totalCost=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of items");
        number=Integer.parseInt(br.readLine());
        
        int[] cost=new int[number];
        
        for(int i=0;i<number;i++){
            System.out.println("Enter the shipping price of the item "+(i+1)+" :");
           try{//if you dont write try catch block here, when alphabetic input is given the statements written in next for loop will not be executed.
               cost[i]=Integer.parseInt(br.readLine());
           }
           catch(NumberFormatException e){
               System.out.println("Exception : java.lang.NumberFormatException\nRe-enter the item price :");
                cost[i]=Integer.parseInt(br.readLine());
           }
           
                    
        }
        
        
        for(int i=0;i<number;i++){
            totalCost=cost[i]+totalCost;
            
        }
        
        System.out.println("Total cost of the container is "+totalCost);
	}
}