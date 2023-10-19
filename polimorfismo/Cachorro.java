package polimorfismo;

public class Cachorro extends Animal{
	public Cachorro (String nome, String sexo, String raca, String nome2) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("o lobo está latindo.");
	}
}

