import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        int n,i,j;
        String privilegeDetails,privilege[];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Role ro=new Role();
    	Privilege p=new Privilege();
		RoleBO rbo=new RoleBO();
        
        System.out.println("Enter number of role :");
    	n=Integer.parseInt(br.readLine());
         
        Role[] role=new Role[n];
        
        for(i=0;i<n;i++){
    		System.out.println("Enter the role "+(i+1)+" details :");
			System.out.println("Enter role name :");
			ro.setName(br.readLine());
			
			System.out.println("Enter description :");
			ro.setDescription(br.readLine());
			
			System.out.println("Enter the privileges :");
			p.setName(br.readLine());
			privilegeDetails=p.getName();
			
			privilege =privilegeDetails.split(",");
			
			Privilege[] privi=new Privilege[privilege.length];			
			for(j=0;j<privilege.length;j++){
				privi[j]=Privilege.createPrivilege(privilege[j]);
		    }
            
                ro.setPrivilege(privi);
						
			role[i] =ro.createRole(ro.getName(), ro.getDescription(), ro.getPrivilege());
			
		}
        System.out.println("Role names which has more number of privileges :");
        rbo.display(role);    
         
    }
    
}
