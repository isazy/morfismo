package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("KIARA", "M", "lobao", "");
		lobo.emitirSom();
		
		Leao leao = new Leao ("simba", "F", "lao", "");
		leao.emitirSom();
		
		Tigre tigre = new Tigre ("princis", "F", "tigrao", "");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro ("morzinho", "f", "PITBULL","");
		cachorro.emitirSom();
		
		Gato gato = new Gato ("kitty", "F", "branca", "");
		gato.emitirSom();
		
	}
}
