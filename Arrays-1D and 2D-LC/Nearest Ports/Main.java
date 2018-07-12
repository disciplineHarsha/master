import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of ports :");
		int np=sc.nextInt();
		
		int[][] distance=new int[np][np];
		
		System.out.println("Enter the distance between all ports :");
		for(int i=0;i<np;i++){
			for(int j=0;j<np;j++){
				distance[i][j]=sc.nextInt();
			}
		}
		
		 int min=0;
		 int port=0;
		 int port1=0;
		 int an=0;
		for(int i=0;i<distance.length;i++){
			min=0;
			for(int j=0;j<distance.length;j++){
				
				if(distance[i][j]>0){
					an=1;
					min=distance[i][j];//assuming first number(other than zero) as min
					port=j+1;
					break;//once minumum number is set breaking the for loop.
				}
				else if(distance[i][j]==0){
					an=0;//all number is zero
					port=i+1;
					
				}
					
			}
			
			for(int k=0;k<distance.length;k++){
				if(distance[i][k]>0){
					if(distance[i][k]<min){//comparing the other number with minumum number.
						min=distance[i][k];
						port=k+1;
					}
				}
			}			
			if(min>0){
				System.out.println("Port " +(i+1) +" is closer to port "+ (port));
			}
			else if(an==0){
				System.out.println("No ports are closer to port "+ (port));
			}
						
		}
			
		
		
	
		
	}

}
