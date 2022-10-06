package lista_01;

import java.util.Scanner;

public class Raio_circulo {
	public static void main(String[] args) {
		
			   Scanner ler = new Scanner(System.in);
			   
		       System.out.println("Escreva o valor do raio");
		       double raio = ler.nextFloat();

		       double area = Math.PI * raio * raio;

		       System.out.println("O valor da area é " + area);
		
	}

}
