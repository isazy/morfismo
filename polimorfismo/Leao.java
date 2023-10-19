package polimorfismo;

public class Leao extends Animal {
	
		public Leao(String nome, String sexo, String raca, String nome2) {
			super(nome, sexo, raca);
		}
		@Override
		public void emitirSom() {
			System.out.println("o leao está gritando");
}
}
