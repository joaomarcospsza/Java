package lista_01;
import java.util.Scanner;

public class Area_quadrado {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double lado_quadrado, area, perimetro;
		
		System.out.println("Informe o lado do quadrado: ");
		lado_quadrado = ler.nextDouble();
		
		area = lado_quadrado * lado_quadrado;
		perimetro = lado_quadrado + lado_quadrado + lado_quadrado + lado_quadrado;
		
		System.out.println("A área do quadrado e: " + area + " e seu perimeto  " + perimetro);
	}

}
