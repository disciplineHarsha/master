package com.multithreading.cc1;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.multithread.practice.ExportShipmentThread;
import com.multithread.practice.Shipment;

public class Main {
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of notification:");
        int numberOfMsg = Integer.parseInt(reader.readLine());
        List<String> notification = new ArrayList<String>();
        for(int i=0;i<numberOfMsg;i++) {
            
            String line = reader.readLine();
            notification.add(line);
        }
        
        System.out.println("Enter number of threads:");
        int numberOfThreads = Integer.parseInt(reader.readLine());
        
        Thread[] threads = new Thread[numberOfThreads];
        int listSize = notification.size();
		int remainder = listSize % numberOfThreads;
		int quotient = listSize / numberOfThreads;
    
		if(numberOfThreads>1){
			int startIndex = 0;
			for (int j = 0; j < quotient; j++) {
				System.out.println(j+1);
				int endIndex = startIndex + numberOfThreads;
				List<String> shipmentSubList = notification.subList(startIndex, endIndex);
				System.out.println("Thread number:" + j + ", startIndex:" + startIndex + ", endIndex:" + endIndex + ", shipmentSubList size:" + shipmentSubList.size());
				threads[j]=new Thread((new NotificationThread(shipmentSubList)));
				//threads[j].start();
				startIndex = endIndex;
			}
	
			//If there is exists remainder then send those sublist in last thread
			if (remainder > 0) {
				System.out.println(remainder);
				/*int start = 0;
				for (int j = 1; j < remainder; j++) {
					int endIndex = start + numberOfThreads;
					List<String> shipmentSubList = notification.subList(start, endIndex);
					System.out.println("Thread number:" + j + ", startIndex:" + startIndex + ", endIndex:" + endIndex + ", shipmentSubList size:" + shipmentSubList.size());
					threads[j]=new Thread((new NotificationThread(shipmentSubList)));
					//threads[j].start();
					startIndex = endIndex;
				}*/
				
								
				
				List<String> shipmentSubList = notification.subList(startIndex, listSize);
				
				System.out.println("Last Thread:" + " startIndex:" + startIndex + ", endIndex:" + listSize+ ", shipmentSubList size:" + shipmentSubList.size());
				System.out.println("Number of threads "+(numberOfThreads-1));
				threads[numberOfThreads-1]=new Thread((new NotificationThread(shipmentSubList)));
				System.out.println(threads[numberOfThreads-1]);
				//threads[numberOfThreads-1].start();
			}
			
		}
		
		else {
			threads[numberOfThreads-1]=new Thread((new NotificationThread(notification)));
		}
        
        //fill your code here!!!
		
		
	/*	for(Thread t:threads){
		//	t.getName();
			
				t.start();
				t.join();
			
			
		}*/
		
		for(int i=0;i<threads.length;i++){
			/*System.out.println(threads.length);
			System.out.println(threads[i]);
			System.out.println(Thread.currentThread().getName());*/
			try{
			/*	threads[i].start();
				threads[i].join();	
				*/
				if(Thread.currentThread().getName()==null){
					
				}
				else{
					threads[i].start();
					threads[i].join();	
				}
				
				
			}
			catch(NullPointerException e){
				
			}
			
			
			
			
		}
		
		
		
    }

}
