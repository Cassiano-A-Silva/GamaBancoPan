package ExercicioHeranca;

public class aves extends Animais{
	
	private String penugem;
	private Boolean caipira;
	
	
	public String getPenugem() {
		return penugem;
	}
	public void setPenugem(String penugem) {
		this.penugem = penugem;
	}
	public Boolean getcaipira() {
		return caipira;
	}
	public void setcaipira(Boolean caipira) {
		this.caipira = caipira;
		
	}
	
	@Override
	public void comunicar() {
		
		if (this.caipira == true) {
			System.out.println("Esse passaro � do interior e diz: Pir - Pir");
		}
		
		else {
			System.out.println("Esse pasaro � da cidade e diz: Piu - Piu");
		}

	}
	
	@Override
	public void movimentar() {
			System.out.println("O passaro voou");
		}
	}

