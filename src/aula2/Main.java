package aula2;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, world");
		
		Ola ola1 = new Ola();
		Ola ola2 = new Ola();
		Ola ola3 = new Ola();
		Ola ola4 = new Ola();
		Ola ola5 = new Ola();
		
		Tchau tchau1 = new Tchau();
		Tchau tchau2 = new Tchau();
		Tchau tchau3 = new Tchau();
		Tchau tchau4 = new Tchau();
		Tchau tchau5 = new Tchau();
		
		ola1.start();
		ola2.start();
		ola3.start();
		ola4.start();
		ola5.start();

		
		tchau1.start();
		tchau2.start();
		tchau3.start();
		tchau4.start();
		tchau5.start();
	}
}
