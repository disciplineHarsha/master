import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int max=0;
        int cs=sc.nextInt();
        int[] id=new int[cs];
        
        for(int i=0;i<id.length;i++){
            id[i] =sc.nextInt();
        }
        
        max=id[0]; 
        for(int i=0;i<id.length;i++){
            
            if(id[i]>max){
                max=id[i];
            }
        
        }
        
        System.out.println("Next customer id is "+(max+1));
	}
        
}