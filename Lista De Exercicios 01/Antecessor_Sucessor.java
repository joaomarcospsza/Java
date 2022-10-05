package lista_01;

import java.util.Scanner;

public class Antecessor_Sucessor {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int x, suce, ante;
		
		System.out.println("Informe um número: ");
		x = ler.nextInt();
		
		suce = x + 1;
		ante = x - 1;
		
		System.out.println("O Sucessor de "+ x + " é " + suce + ".");
		System.out.println("O Antecessor de "+ x + " é " + ante + ".");
		
		
	} {
		
	}
}
