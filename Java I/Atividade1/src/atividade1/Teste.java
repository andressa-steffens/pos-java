package atividade1;

import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args) {
		
		Veiculo[] veiculos = new Veiculo[5];  
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < veiculos.length; i++) {
			veiculos[i] = criaVeiculo(in);
		}//end for
		
		for (Veiculo veiculo : veiculos) {
			mostraVeiculo(veiculo.getPlaca(), veiculo.getMarca(), veiculo.getModelo(),
					veiculo.getVelocMax(), veiculo.getMotor().getQtdPist(),
					veiculo.getMotor().getPotencia());
		}
		
		Veiculo v1 = new Veiculo();
		mostraVeiculo(v1.getPlaca(), v1.getMarca(), v1.getModelo(), v1.getVelocMax(),
				v1.getMotor().getQtdPist(), v1.getMotor().getPotencia());
		
		in.close();
		
	}//end main method

	public static Veiculo criaVeiculo(Scanner in){
		
		String tempPlaca;
		String tempMarca;
		String tempModelo;
		float tempVelocMax;
		int tempQtdPist;
		int tempPotencia;
		

		
		System.out.println("Insira as informações do veículo:");
		System.out.println("Placa:");
		tempPlaca = in.nextLine();
		System.out.println("Marca:");
		tempMarca = in.nextLine();
		System.out.println("Modelo:");
		tempModelo = in.nextLine();
		System.out.println("Velocidade máxima:");
		tempVelocMax = in.nextFloat();
		System.out.println("Qtd pist:");
		tempQtdPist = in.nextInt();
		System.out.println("Potencia:");
		tempPotencia = in.nextInt();
		in.nextLine();
		
		return new Veiculo(tempPlaca, tempMarca, tempModelo, tempVelocMax, tempQtdPist, tempPotencia);
	}
	
	public static void mostraVeiculo(String placa, String marca, String modelo, float velocMax, int qtdPist, int potencia){
		
		System.out.println("VEICULO:");
		System.out.println("Placa:" + placa);
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Velocidade máxima:" + velocMax);
		System.out.println("Qtd pist:" + qtdPist);
		System.out.println("Potẽncia:" + potencia);
		
	}
	
}//end Teste class 
