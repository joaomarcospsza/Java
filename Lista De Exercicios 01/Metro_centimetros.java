package lista_01;

import java.util.Scanner;

public class Metro_centimetros {
	public static void main(String[] args) {
		//Fa�a um programa que converta metros para cent�metros.
		Scanner ler = new Scanner(System.in);
		
		int cent, metro;
		
		System.out.println("Informe o valor em metro para ser convertido: ");
		metro = ler.nextInt();
		
		cent = metro * 100;
		
		System.out.println(metro + " metros em centimentros ficara: " + cent);
		
	}

}
