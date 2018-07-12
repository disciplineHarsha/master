public class ShipmentBO {
public Boolean validateShipment(String p1, String p2, Port[] ports) throws InvalidPortException {
        Boolean flag=false;
    	/*for (int i = 0; i < ports.length; i++) {
            if(!(p1.equalsIgnoreCase(p2))){
    			if ((ports[i].getName().equalsIgnoreCase(p1) || ports[i].getName().equalsIgnoreCase(p2))) {
    				return true;
    			}
                else
    			    throw new InvalidPortException("InvalidPortException: The port name is invalid");
            }    
    			else 
    				throw new InvalidPortException("InvalidPortException: The port name is invalid");

		}*/
        
        if(!(p1.equalsIgnoreCase(p2))){
    		for (int i = 0; i < ports.length; i++) {
				if (ports[i].getName().equalsIgnoreCase(p1) ) {
					
					for(int j=0;j<ports.length;j++){
						if((ports[j].getName().equalsIgnoreCase(p2))){
							flag= true;
						}
						
					}
					
					
				}
	
			}  
		}
	    
        if(flag){
            return flag;
        }
        else {
			throw new InvalidPortException("The port name is invalid");
        }
		

	}

    void displayShipmentDetails(Shipment shipmentObj, Port[] ports, String p1, String p2) /*throws InvalidPortException*/ {
       // if(!(p1.equalsIgnoreCase(p2))){    
		    for (int i = 0; i < ports.length; i++) {
			   if (ports[i].getName().equalsIgnoreCase(p1) ) {
    				for(int j=0;j<ports.length;j++){
    					
                        if(ports[j].getName().equalsIgnoreCase(p2)){
    					   
                            System.out.format("%-15s %-15s %-15s %-15s\n", shipmentObj.getId(), shipmentObj.getName(),
    								shipmentObj.getArrivalport().toString() + "/" + ports[i].getCountry().toString(),
    								shipmentObj.getDepartureport().toString() + "/" + ports[j].getCountry().toString());
    					}
    					
                    }
                }
    		}
       // }
        /*else 
            throw new InvalidPortException("InvalidPortException: The port name is invalid");*/
	}        
}