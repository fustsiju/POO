package aplicacao;

import java.util.Scanner;

import entities.triangulo_poo;

public class programa_poo {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		triangulo_poo x, y; //Utilizando a classe criada dentro do pacote 'entities'.
		x = new triangulo_poo(); //Alocando dinamicamente na memória
		y = new triangulo_poo(); //Alocando dinamicamente na memória
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = num.nextDouble(); //Variável X apontando para A dentro da classe triangulo_poo.
		x.b = num.nextDouble(); //Variável X apontando para B dentro da classe triangulo_poo.
		x.c = num.nextDouble(); //Variável X apontando para C dentro da classe triangulo_poo.
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = num.nextDouble();
		y.b = num.nextDouble();
		y.c = num.nextDouble();
		
		double areaX = x.area(); //Chamando o método dentro da classe triangulo_poo.
		double areaY = y.area(); //Chamando o método dentro da classe triangulo_poo.
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		num.close();
	}
}
