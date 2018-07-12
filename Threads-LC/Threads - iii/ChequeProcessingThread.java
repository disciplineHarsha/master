



import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ChequeProcessingThread implements Runnable
 {
 
    private int  paymentid;
	private int amount;
	private String paymentcode;
    private BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        
	public BlockingQueue<String> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	public ChequeProcessingThread(int paymentid,int amount,String paymentcode){
		this.paymentid=paymentid;
		this.amount=amount;
		this.paymentcode=paymentcode;
	}
	
	public ChequeProcessingThread(BlockingQueue<String> queue){
		this.queue=queue;
	}
	
	
	 public ChequeProcessingThread() {
		// TODO Auto-generated constructor stub
	}


	public int getPaymentid() {
			return paymentid;
		}



		public void setPaymentid(int paymentid) {
			this.paymentid = paymentid;
		}



		public int getAmount() {
			return amount;
		}



		public void setAmount(int amount) {
			this.amount = amount;
		}



		public String getPaymentcode() {
			return paymentcode;
		}



		public void setPaymentcode(String paymentcode) {
			this.paymentcode = paymentcode;
		}

	
    public void run()  {
    	try {
		//	String s=queue.take();
        String s=queue.poll(1000, TimeUnit.SECONDS);
			String[] split=s.split(",");
		    
			System.out.println("Cheque processing completed for payment id "+split[0]);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
    
     public void addCheque(String val) throws InterruptedException {
       queue.put(val);
    }
}
