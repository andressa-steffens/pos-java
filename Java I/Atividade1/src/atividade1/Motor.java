package atividade1;

public class Motor {

	//Variables
	private int qtdPist;
	private int potencia;
	
	//Constructors
	public Motor() {
		this.qtdPist= 0;
		this.potencia= 0;
	}//end constructor default method

	public Motor(int qtdPist, int potencia) {
		super();
		this.qtdPist = qtdPist;
		this.potencia = potencia;
	}//end constructor method

	public int getQtdPist() {
		return qtdPist;
	}

	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
