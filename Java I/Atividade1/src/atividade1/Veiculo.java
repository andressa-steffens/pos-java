package atividade1;

public class Veiculo {

	//Variables
	private String placa;
	private String marca;
	private String modelo;
	private float velocMax;
	private Motor motor;
	
	//Constructors
	public Veiculo() {
		this.placa = " ";
		this.marca = " ";
		this.modelo = " ";
		this.velocMax = 0;
		this.motor = new Motor();
	}//end constructor default method
	
	public Veiculo(String placa, String marca, String modelo, float velocMax, int qtdPist, int potencia) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.velocMax = velocMax;
		this.motor = new Motor(qtdPist, potencia);

	}//end constructor method

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}
