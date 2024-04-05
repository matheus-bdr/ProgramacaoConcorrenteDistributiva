package counter;

public class counter {
	private Integer value;
	
	public counter(Integer value) {
		this.value = value;
	}
	
	public void increment() {
		this.value++;
	}
	public Integer getValue() {
		return this.value;
	}
}
