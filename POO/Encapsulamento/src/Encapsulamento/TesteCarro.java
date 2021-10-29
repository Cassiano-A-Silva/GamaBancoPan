package Encapsulamento;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.setPlaca("KFC4513");
		System.out.println(c1.getPlaca());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.getVelocidade());
		
		Carro c2 = new Carro();
		
		c2.setPlaca("GHT5236");
		System.out.println(c2.getPlaca());
		
		Carro c3 = new Carro(null, false, null, null, 0, 0);
		System.out.println(c3);
	}

}
