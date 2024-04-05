package counter;

public class Main {
	public static void main(String[] args) {
		counter counter = new counter(0);
		
		incrementer in1 = new incrementer(counter);
		incrementer in2 = new incrementer(counter);
		incrementer in3 = new incrementer(counter);
		incrementer in4 = new incrementer(counter);
	
		in1.start();
		in2.start();
		in3.start();
		in4.start();
		
		try{
				in1.join();
				in2.join();
				in3.join();
				in4.join();
		}catch(InterrupedExcepcion e) {
			System.out.println(   "erro ao chamar joins");
		}
		
	}
}
