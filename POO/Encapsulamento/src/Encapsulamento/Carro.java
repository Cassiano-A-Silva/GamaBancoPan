package Encapsulamento;

public class Carro implements Controlador{

	public String cor;
	public boolean ligado;
	public String marca;
	private String placa;
	public int ano;
	private int velocidade;
	
	
	public Carro() {

	}
	
	public Carro(String cor, boolean ligado, String marca, String placa, int ano, int velocidade) {
		super();
		this.cor = cor;
		this.ligado = ligado;
		this.marca = marca;
		this.placa = placa;
		this.ano = ano;
		this.velocidade = velocidade;
	}



	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public void acelerar() {
		
		System.out.println("Velocidade aumentada em 5 Km/h");
		this.velocidade = getVelocidade() + 5;
		
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	

}
