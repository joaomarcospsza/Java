package lista_01;

import java.util.Scanner;

public class Calcular_imc {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Informe o seu peso: ");
		peso = ler.nextDouble();
		
		System.out.println("Informe a sua altura em centimetros: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);

	}

}
