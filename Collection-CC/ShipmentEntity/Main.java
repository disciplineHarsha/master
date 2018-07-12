package com.collection.cc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.comparator.Port;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String shipment="null";
		ShipmentEntity s=new ShipmentEntity();
		List<ShipmentEntity> shipmentList=new ArrayList<ShipmentEntity>();//creating list collection 
		String dec=null;
		System.out.println("Enter the number of shipment:");
		int n=Integer.parseInt(br.readLine());
	
		for(int i=0;i<n;i++){
			System.out.println("Enter the shipment entity "+(i+ 1)+" details:");
			shipment=br.readLine();
			String[] shipmentEntity=shipment.split(",");
			s.setId(Integer.parseInt(shipmentEntity[0]));
			s.setName(shipmentEntity[1]);
			s.setAccountNumber(shipmentEntity[2]);
			s.setIdentificationNumber(shipmentEntity[3]);
			shipmentList.add(new ShipmentEntity(s.getId(),s.getName(),s.getAccountNumber(),s.getIdentificationNumber()));
			
		}
	Collections.sort(shipmentList);
	//Collections.sort(portList,new Port());
	
	
	System.out.println("Shipment entity details:");
	System.out.format("%-15s %-15s %-15s %s\n","Id","Name","Account number","Identification number");
	
	for(int i=0;i<shipmentList.size();i++){
		System.out.println(shipmentList.get(i));
		
	}
	}

}
