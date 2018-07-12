import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int nc=sc.nextInt();
        
        int[] id=new int[nc];
       // int num=0;
        for(int i=0;i<id.length;i++){
            id[i]=sc.nextInt();
        
        }
        
        for(int i=0;i<id.length-1;i++){
            if((id[i+1]-id[i])!=1){
                //num=id[i+1]-1;
                System.out.println("Customer id "+(id[i+1]-1)+" is missing");
            }
            
        
        }
        
        
	}
}