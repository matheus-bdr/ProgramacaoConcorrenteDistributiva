package counter;

public class counter {
	private Integer value;
	
	public counter(Integer value) {
		this.value = value;
	}
	
	//public synchronized void increment() {}
	
	public void increment() {
		this.value++;
	}
	
	public Integer getValue() {
		return this.value;
	}
}