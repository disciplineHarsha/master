import java.util.Arrays;


public class RoleBO {
    
    public RoleBO(){
    }
    
    
    
    public void display(Role[] role)
    {
       //Role max =role[0];
    	int max=0;
		int count=0;
		int j=0;
		int z=0;
		int c=0;
		int howmany=0;
		boolean flag=false;
		
		;
		
		for( j=1;j<role.length;j++){
			if(((role[0].getPrivilege()).length)==((role[j].getPrivilege()).length)){
				max=role[0].getPrivilege().length;
				count++;
				flag=true;
				//count=count+1;
			}

		}
		
		if(flag==false){
			for(int i=0;i<role.length;i++){
			
				for( j=0;j<role.length;j++){
									
					if(((role[i].getPrivilege()).length)<((role[j].getPrivilege()).length)) {
						max=role[j].getPrivilege().length;//checking for the max., length in the role array
						count++;
						//count=count+1;
									
					}
					
												
				}
			//System.out.println(max.getName());
			}
		}	
		
		String[] sorted=new String[count+1];
			
				//System.out.println(count);
		//System.out.println(max);
			
		for(int i=0;i<role.length;i++){
			if(max==role[i].getPrivilege().length){
				//count++;
				sorted[z]=role[i].getName();
				z++;
				//System.out.println(role[i].getName());
				
			}
			
		}


		//System.out.println(sorted.length);
		for(int p=0;p<sorted.length;p++){
			if(sorted[p]!=null){
				howmany++;
			}
		}
		
		if(howmany>1){
			Arrays.sort(sorted);
		}
		
		for(int k=0;k<sorted.length;k++){
			if(sorted[k]!=null){
				System.out.println(sorted[k]);
			}
			
		}
		
         
    }     
}
    