package ExercicioHeranca;

public class Felinos extends Animais {

	private String corPelo;
	private boolean domestico;
	
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	public boolean isDomestico() {
		return domestico;
	}
	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}
	
	@Override
	public void comunicar() {
		if (this.domestico == true) {
			System.out.println("O felino é domestico e miou!");
		}
		else {
			System.out.println("O felino é selvagem e rugiu!");
		}
	}
	@Override
	public void movimentar() {
		System.out.println("O felino correu");
	}
	
	}


