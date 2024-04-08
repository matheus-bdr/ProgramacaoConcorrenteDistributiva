package counter;

public class incrementer extends Thread {
	private counter counter;
	
	public incrementer(counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		System.out.println(this.getName() + 
				" está incrementando...");
		this.counter.increment();
	}
}