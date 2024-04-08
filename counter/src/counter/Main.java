package counter;

public class Main {
	public static void main(String[] args) {
		int numExec = 0;
		while(true) {
			counter counter = new counter(0);
			
			incrementer inc1 = new incrementer(counter);
			incrementer inc2 = new incrementer(counter);
			incrementer inc3 = new incrementer(counter);
			incrementer inc4 = new incrementer(counter);
			
			inc1.start();
			inc2.start();
			inc3.start();
			inc4.start();
			
			try {
				inc1.join();
				inc2.join();
				inc3.join();
				inc4.join();
			} catch (InterruptedException e) {
				System.out.println("Erro ao chamar joins...");
				e.printStackTrace();
			}
			numExec++;
			if(counter.getValue() == 2) {
				System.out.println("Num. de execuções: " + numExec);
				System.out.println("Valor final do contador: " + counter.getValue());
				break;
			}
		}
	}
}