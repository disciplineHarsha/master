package com.encapsulation.cc1;


public class Item {   

   Integer id;
   String name;
   Double price;
    
   
   public Item(){
   }
   
   
   Item(Integer id,String name,Double price){
        this.id = id;
        this.name = name;
        this.price = price;        
    }
    
    
    void setId(Integer id){
        this.id = id;
    }
    Integer getId(){
        return id;
    }
    
     void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    
    void setPrice(Double price){
        this.price = price;
    }
    Double getPrice(){
        return price;
    }
    
    public String toString(){
    	
    	
    	return String.format(this.getName());
    }
}
