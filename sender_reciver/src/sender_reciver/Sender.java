package sender_reciver;

import java.util.concurrent.ThreadLocalRandom;

public class Sender extends Thread {
	private Data data;
	private String[] messages;
	
	public Sender (Data data, String[] messages) {
		this.data = data;
		this.messages = messages;
	}
	public void run() {
		for(String message:this.messages) {
			int randomTime = 
					ThreadLocalRandom.current().nextInt(3000,8000);
			try {
				Thread.sleep(randomTime);
			}catch(InterruptedException e) {
				System.out.println("Thread interrompida");
			}
			
			data.send(messages);
		}
	}
}
