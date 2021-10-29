package ExercicioHeranca;

public abstract class Animais {
	
	private String nome;
	private String Especie;
	private String Alimentacao;
	private boolean corredor;
	private boolean voador;
	private boolean nadador;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClassificacaoEspecie() {
		return Especie;
	}
	public void setClassificacaoEspecie(String classificacaoEspecie) {
		this.Especie = classificacaoEspecie;
	}
	public String getClassificacaoAlimentar() {
		return Alimentacao;
	}
	public void setClassificacaoAlimentar(String classificacaoAlimentar) {
		this.Alimentacao = classificacaoAlimentar;
	}
	public boolean isCorredor() {
		return corredor;
	}
	public void setCorredor(boolean corredor) {
		this.corredor = corredor;
	}
	public boolean isVoador() {
		return voador;
	}
	public void setVoador(boolean voador) {
		this.voador = voador;
	}
	public boolean isNadador() {
		return nadador;
	}
	public void setNadador(boolean nadador) {
		this.nadador = nadador;
	}
	
	public void comunicar() {
		System.out.println("Emitiu barulho");
	} 
	
	public void movimentar() {
		
		if (this.corredor == true) {
			System.out.println("Correndo!!!");
		}
		
		else if (this.voador == true) {
			System.out.println("Voando!!!");
		}
		else if (this.nadador == true) {
			System.out.println("Nadando!!!");
		}
		System.out.println("Emitiu barulho");
	}
	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", Especie=" + Especie + ", Alimentacao=" + Alimentacao + ", corredor="
				+ corredor + ", voador=" + voador + ", nadador=" + nadador + "]";
	} 
	
	
		
	

}
