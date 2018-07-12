public class ShipmentBO implements IExportData {

    @Override
	public void convertToJSON(Shipment[] shipmentObj) {
		for (int i = 0; i < shipmentObj.length; i++) {
			System.out.println("[\n{");
			System.out.println("\"id\":" + shipmentObj[i].getId() + "\n\"name\":" + "\"" +shipmentObj[i].getName()+ "\"" +"\n\"arrivalName\":"
					+ "\""+shipmentObj[i].getArrivalPort()+"\"");
			System.out.println("\"departureName\":" +"\""+ shipmentObj[i].getDeparturePort() +"\""+ "\n\"shipmentCode\":"
					+"\""+ shipmentObj[i].getStatus().getCode() +"\""+ "\n\"shipmentName\":" + "\""+shipmentObj[i].getStatus().getName()+"\"");
			System.out.println("}\n]");
		}

	}

	@Override
	public void convertToCSV(Shipment[] shipmentObj) {
		for(int i=0;i<shipmentObj.length;i++){
			
			System.out.println(shipmentObj[i]);
		}

	}

}