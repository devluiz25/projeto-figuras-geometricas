package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Retangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("*** DADOS DO CIRCULO ***");
		System.out.println("-----------------------------------------------");
		System.out.print("INFORME A COR: ");
		String circleColor = sc.next();
		System.out.print("INFORME O RAIO: ");
		double radius = sc.nextDouble();
		
		AbstractShape circle = new Circle(Color.valueOf(circleColor), radius);
		
		System.out.println();
		
		System.out.println("*** DADOS DO RETANGULO ***");
		System.out.println("------------------------------------------------");
		System.out.print("INFORME A COR: ");
		String retangleColor = sc.next();
		System.out.print("INFORME O PESO: ");
		double height = sc.nextDouble();
		System.out.print("INFORME A ALTURA: ");
		double width = sc.nextDouble();
		
		AbstractShape retangle = new Retangle(Color.valueOf(retangleColor), height, width);
		
		System.out.println();
		
		System.out.println("*** CIRCULO ***");
		System.out.println("COR: " + circle.getColor());
		System.out.println("AREA DO CIRCULO: " + String.format("%.1f", circle.area()));
		
		System.out.println();
		
		System.out.println("*** RETANGULO ***");
		System.out.println("COR: " + retangle.getColor());
		System.out.println("AREA DO RETANGULO: " + String.format("%.1f", retangle.area()));
		
		
		sc.close();
	}

}
