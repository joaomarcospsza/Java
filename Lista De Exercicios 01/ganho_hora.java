package lista_01;

import java.util.Scanner;

public class ganho_hora {

	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double ganho_Horas, horas_trabalhada, ganho_diario,total;
		
		System.out.println("Informe quanto ganha por hora: ");
		ganho_Horas = ler.nextDouble();
		System.out.println("Informe as suas horas trabalhadas: ");
		horas_trabalhada = ler.nextDouble();
		
		
		ganho_diario = ganho_Horas * horas_trabalhada;
		total = ganho_diario * 30;
		
		System.out.println("O seu gnaho diarío é de " + ganho_diario + " e o seu salario é " + total);
		

	}
}
