package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triandulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f\n", areaX);
		System.out.printf("Triangulo Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area: X");
		}else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();
	}

}
