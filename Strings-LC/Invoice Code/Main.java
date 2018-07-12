import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the invoice code");
		String code=sc.nextLine();
		int length=code.length()-code.substring(0, 3).length();
		StringBuilder sb=new StringBuilder();
		String s=code.substring(2);
		if(code.length()<7){
			if(code.contains("CU")){
				sb.replace(0, 3, "CUR");
				
				if(length<5){
					
					for(int i=0;i<4-length;i++){
						sb.replace(i+3, (i+3)+1, "0");
					}
					
					System.out.println("Formated Code :\n"+sb.append(s));
					
				}
				
			}
			else if(code.contains("AT")){
				sb.replace(0, 3, "AGT");
				if(length<5){
					for(int i=0;i<4-length;i++){
						sb.replace(i+3, (i+3)+1, "0");
					}
					
					System.out.println("Formated Code :\n"+sb.append(s));
					
				}
			}
			else if(code.contains("CY")){
				sb.replace(0, 3, "CMY");
				if(length<5){
					for(int i=0;i<4-length;i++){
						sb.replace(i+3, (i+3)+1, "0");
					}
					
					System.out.println("Formated Code :\n"+sb.append(s));
					
				}
			}
			
		}
		
		
		
		
		
		
	}

}
