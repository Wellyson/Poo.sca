package poo.sca;

public class Professor {
	
	private String nome;
	private int matricula;
	
	
	public Professor(String nome, int matricula){
		this.nome = nome;
		this.matricula = matricula;
	}
	
	Professor(){
		this("no name", -1);
		
	}
	
	public String toString(){
		return "Professor: "+this.nome+ "Matricula: "+this.matricula;
	}
	
	
	public String getNome(){
		return this.nome;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public void setProfessor(String novoProfessor){
		this.nome = novoProfessor;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	

}
