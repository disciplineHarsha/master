import java.util.Scanner;


public class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
        
        int np=sc.nextInt();
        
        int[][] ports=new int[np][np];
        
        for(int i=0;i<ports.length;i++){
            for(int j=0;j<ports[0].length;j++){
                ports[i][j]=sc.nextInt();
                    
            }
        }
        
        System.out.println("Enter two port numbers A and B :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(ports[a-1][b-1]==1){
            System.out.println("There is a route");
        }
        else if(ports[a-1][b-1]==0){
            System.out.println("There is no route");
        }
        else{
            System.out.println("Invalid Inputs");
        }
        
	}
}