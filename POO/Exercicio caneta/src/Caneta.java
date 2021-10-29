// Classe caneta
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	//Metodos de uso da classe caneta
	void status () {
		
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("A ponta dessa caneta � da espessura " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("A caneta est� tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! N�o � poss�vel rabiscar com a caneta tampada.");
		} else {
			System.out.println("Estou rabiscando!");
		}

	}
	
	void tampar ( ) {
		
		this.tampada = true;

	}
	
	void destampar () {
		
		this.tampada = false;
		
	}
}
