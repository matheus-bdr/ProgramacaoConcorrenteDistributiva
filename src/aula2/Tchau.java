package aula2;

public class Tchau extends Thread {
	public void run() {
		System.out.println("Entrando em "+ this.getName());
		System.out.println(this.getName()+": novelada");
		System.out.println("Saindo de "+ this.getName());
	}
}