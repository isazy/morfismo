package polimorfismo;

public class Lobo extends Animal {

	public Lobo(String nome, String sexo, String raca, String nome2) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("o lobo está uivando.");
	}
}