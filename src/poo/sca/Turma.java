package poo.sca;

import java.util.ArrayList;
import java.util.Iterator;

public class Turma {
	
	private String periodo;
	private Disciplina disciplina;
	private int numero;
	private int codDisciplina;
	private ArrayList<Professor> professor;
	private ArrayList<Curso> curso;
	
	
	public Turma(Disciplina d, int numero, String periodo){
		this.disciplina = d;
		this.numero = numero;
		this.periodo = periodo;
			
	}
	
	public String toString(){
		return "Periodo: "+ this.periodo+
			   "Disciplina: "+this.disciplina+
			   "Numero: "+this.numero+
			   "CodDisciplina: "+this.codDisciplina;
	}
	
	public void addProfessor(Professor professor){
		this.professor.add(professor);
		
	}
	
	
	public Iterator<Professor> getProfessorIterator(){
		return this.professor.iterator();
	}
	
	public Iterator<Curso> getCursoIterator(){
		return this.curso.iterator();
	}
		
	public Disciplina getDisciplina(){
		return this.disciplina;
	}
	
	public String getPeriodo(){
		return this.periodo;
	}
	
	public int getCodDisciplina(){
		return this.codDisciplina;
	}
	public int getNumero(){
		return this.numero;
	}
	

	public void setPerido(String novoPeriodo) {
		this.periodo = novoPeriodo;	
	}
	
	public void setDisciplina(Disciplina disciplina){
		this.disciplina = disciplina;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public void setCodDisciplina(int codDisciplina){
		this.codDisciplina = codDisciplina;
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	


