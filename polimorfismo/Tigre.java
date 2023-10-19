package polimorfismo;

public class Tigre extends Animal{
	public Tigre (String nome, String sexo, String raca, String nome2) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("o tigre está uivando.");
	}
}


