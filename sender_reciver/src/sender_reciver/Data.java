package sender_reciver;

public class Data {
	private String message;
	private boolean isSending = true;
	

	public synchronized void send(String message) {
		while(isSending) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Thread interrompida");
			}
		}
		this.isSending = false;
		this.message = message;
		notify();
	}
	public synchronized String recive() {
		while(isSending) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Thread interrompida");
			}
		}
		String recivedMessage = this.message;
		this.isSending = false;
		
		notify();
		
		return recivedMessage;
		
	}
}
