package sender_reciver;

import java.util.concurrent.ThreadLocalRandom;

public class Reciver extends Thread {
	private Data data;
	
	public Reciver(Data data) {
		this.data = data;
	}
	public void run() {
		String message = data.recive();
		int randomTime = 
				ThreadLocalRandom.current().nextInt(3000,8000);
		try {
			Thread.sleep(randomTime);
		}catch(InterruptedException e) {
			System.out.println("Thread interrompida");
		}
		if(message == "END") {
			System.out.println("Não há mais mensagens para receber");
			break;
		}
	}

}
