


public class Port {

   private int id;
   private String name;
   private String country;
   
   public Port(int id,String name){
       
       
       this.setId(id);
       this.setName(name);
       this.setCountry("India");
   }
   
   public Port(int id, String name, String country){
        this(id, name);
        //this.setId(id);
       //this.setName(name);
        this.setCountry(country);
         
   }
   
   public Port(){
       
   } 
   
   public int getId(){
       return id;
   }
   
   public void  setId(int id){
       this.id=id;
   }
   
   public String getName(){
       return name;
   }
   
   public void setName(String name){
       this.name=name;
   }
   
   public String getCountry(){
       return country;
   }
   
   public void setCountry(String country){
       this.country=country;
       
   }
   
    public static Port CreateNewPort(int id, String name, String country){
       
	   Port p=new Port(id, name, country);
	   return p;
	   
   }
   
   public static Port CreateNewPort(int id2, String name2) {
    
    Port p1=new Port(id2, name2);
	return p1;
}
   
   public String toString(){
	   
	   return String.format("%-15s %-15s %-15s", this.getId(), this.getName(), this.getCountry());
   }
   
   
   
      
}
