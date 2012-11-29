package poo.sca;
import poo.sca.io.*;

import java.util.Iterator;



public class SCAFacade{
	
	SCAPersistenciaMemoria persistencia = new SCAPersistenciaMemoria();
	
	public Disciplina criarDisciplina(String nomeDisciplina, int numero){
		Disciplina d = new Disciplina(nomeDisciplina, numero);
		persistencia.salvar(d);
		return d;
	}
		
	public Professor criarProfessor(String nome, int matricula){
		Professor p = new Professor(nome, matricula);
		persistencia.salva(p);
		return p;
		
	}
	
	public Curso criarCurso(String curso, int numero){
		Curso c = new Curso(curso, numero);
		persistencia.salvar(c);
		return c;
	}
	
	public Turma criarTurma(Disciplina disciplina, int numero, String periodo){
		Turma t = new Turma(disciplina, numero, periodo);
		persistencia.salvar(t);
		return t;
	}
	
	
	public Iterator<Disciplina> getDisciplinaIterator(){
		return this.persistencia.recuperarDisciplina().iterator();
	}

	public Iterator<Professor> getProfessorIterator(){
		return this.persistencia.recuperarProfessor().iterator();
	}
		
	public Iterator<Curso> getCursoIterator(){
		return this.persistencia.recuperarCurso().iterator();
	}
	
	public Iterator<Turma> getTurmaIterator(){
		return this.persistencia.recuperarTurma().iterator();
	}
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}