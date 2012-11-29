package poo.sca;

public class Disciplina {
	
	private int codigo;
	private String nome;
	
	public Disciplina(String nome, int codigo){
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String toString(){
		return "Disciplina: "+ this.nome  + " Codigo: "+this.codigo;
		
	}
	
	public Disciplina(){
		this("No name", -1);
	}
	
	public void setDisciplina(String disciplina){
		this.nome = disciplina;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
}
