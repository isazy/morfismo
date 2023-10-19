package polimorfismo;

public class Gato extends Animal{
	public Gato (String nome, String sexo, String raca, String nome2) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("o gato está miando.");
	}
}

