package ExercicioHeranca;

public class TesteAnimais {

	public static void main(String[] args) {
		aves pintinho = new aves();
		aves canario = new aves();
		Felinos gato = new Felinos();
		Felinos onca = new Felinos();
		
		System.out.println("Primeira Ave");		
		pintinho.setNome("João");
		pintinho.setClassificacaoEspecie("Ave");
		pintinho.setClassificacaoAlimentar("Herbivoro");
		pintinho.setVoador(true);
		pintinho.setPenugem("Amarela");
		pintinho.setcaipira(true);
		System.out.println(pintinho.toString());
		pintinho.comunicar();
		pintinho.movimentar();
		
		System.out.println("Segunda Ave");
		canario.setNome("Roberto");
		canario.setClassificacaoEspecie("Ave");
		canario.setClassificacaoAlimentar("Herbivoro");
		canario.setVoador(true);
		canario.setPenugem("Azul");
		canario.setcaipira(false);
		System.out.println(pintinho.toString());
		canario.comunicar();
		pintinho.movimentar();
		
		System.out.println("Primeiro Felino");
		gato.setNome("Tom");
		gato.setClassificacaoEspecie("Felino");
		gato.setClassificacaoAlimentar("Carnivoro");
		gato.setCorredor(true);
		gato.setCorPelo("Rajado");
		gato.setDomestico(true);
		System.out.println(gato.toString());
		gato.comunicar();
		gato.movimentar();
		
		System.out.println("Segundo Felino");
		onca.setNome("Dona Onça");
		onca.setClassificacaoEspecie("Felino");
		onca.setClassificacaoAlimentar("Carnivoro");
		onca.setCorredor(true);
		onca.setCorPelo("Rajado");
		onca.setDomestico(false);
		System.out.println(gato.toString());
		onca.comunicar();
		onca.movimentar();

	}

}
