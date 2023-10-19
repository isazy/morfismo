package InterfaceComputador;

public class Home implements Computador {
	@Override
	public void ligar() {
		System.out.println("o home esta ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("o home esta reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("o home esta desligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("o home esta carregando sistema");
	}
}
