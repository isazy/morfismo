package InterfaceComputador;

public class Principal {
	public static void main (String[] args) {
		Gamer gamer = new Gamer();
		System.out.println("GAMER");
		
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
	
	
		Home home = new Home();
		System.out.println("HOME");
		
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
}
}
