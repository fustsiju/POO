package entities;

public class triangulo_poo { //Classe que recebe os valores a,b e c de X e Y.
	
	public double a;
	public double b;
	public double c;
	
	public double area(){ //Método para cálculo da área.
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

//Beneficios de utilizar Métodos: 
// Reaproveitamento de código, eliminando repetição no programa principal.
// Delegação de responsabilidades: Quem deve ser responsável por saber como calcular a área de um triangulo é o próprio triangulo.
// Ou seja, a lógica do cálculo não deve estar em outro lugar.
