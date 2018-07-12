package com.multithreading.cc1;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationThread implements Runnable
{
	List<String> notification=new ArrayList<String>();
    
    public NotificationThread(List<String> notification) {
		super();
		this.notification = notification;
	}

	public List<String> getNotification() {
		return notification;
	}

	public void run() {
        
       Iterator ite=notification.iterator();
       while (ite.hasNext()){
    	   String s=ite.next().toString();
    	   String[] split=s.split(",");
    	   NotificationManager.getInstance().sendMessage(split[0], Integer.parseInt(split[1]));
		
	}
    }
    
    public void setNotification(List<String> notification) {
        this.notification = notification;
    }
    
}

