package aula2;

public class Ola extends Thread {
	public void run() {
		System.out.println("Entrando em "+ this.getName());
		System.out.println(this.getName()+": Novelinha");
		System.out.println("Saindo de "+ this.getName());
	}
}
