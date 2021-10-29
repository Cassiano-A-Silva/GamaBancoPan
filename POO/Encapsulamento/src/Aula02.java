// Aula sobre instanciar objeto caneta
public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta ();
		Caneta c2 = new Caneta ();
		
		//Caneta um teste de validação do metodo rabiscar
		//Atributos devem ser utilizados sem os parenteses, descrevendo o atributo ou importando-o
		c1.cor = "Azul";
		c1.modelo = "BIC";
		c1.ponta = 0.5f;
		//Metodo sempre deve ser utilizado com ()
		c1.destampar ();
		c1.rabiscar();
		c1.status();
		
		//Caneta dois teste de validação do metodo rabiscar
		c2.cor = "Verde";
		c2.modelo = "Faber-Castell";
		c2.ponta = 0.8f;
		//Metodo sempre deve ser utilizado com ()
		c2.tampar ();
		c2.rabiscar();
		c2.status();
	}

}
