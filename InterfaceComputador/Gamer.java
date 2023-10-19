package InterfaceComputador;

public class Gamer implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("o game esta ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("o game esta reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("o game esta desligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("o game esta carregando sistema");
	}
}
