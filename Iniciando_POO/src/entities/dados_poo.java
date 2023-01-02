package entities;

public class dados_poo {
	
	public String nome;
	public double preco;
	public int quantidade;
	public double total;
	public int add;
	public int rem;
	
	public int AddProducts() {
		
		quantidade = quantidade + add;
		
		return quantidade;
		
	}
	public int RemoveProducts() {
		
		quantidade = quantidade - rem;
		
		return quantidade;
		
	}
	public double TotalValueInStock() {
		total = quantidade * preco;
		return total; 
	}
}
