package poo.sca;

public class Curso {
	private String nome;
	private int numero;
	
	Curso(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
	}
	
	Curso(){
		this("no name", -1);
		
	}
	
	
	public String toString(){
		return "Curso: "+this.nome + "Numero: "+this.numero;
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}
	
	public String getNome(){
		return this.nome;
	}
	public int getNumero(){
		return this.numero;
	}
	
	

}
