package poo.sca.io;

import java.util.ArrayList;
import poo.sca.Curso;
import poo.sca.Disciplina;
import poo.sca.Professor;
import poo.sca.Turma;

public class SCAPersistenciaMemoria implements SCAPersistencia{
	
	ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
	ArrayList<Professor> professor = new ArrayList<Professor>();
	ArrayList<Curso> curso = new ArrayList<Curso>();
	ArrayList<Turma> turma = new ArrayList<Turma>();
	
	
	
	
	@Override
	public void salvar(Disciplina disciplina) {
		this.disciplina.add(disciplina);
		
	}
	
	@Override
	public ArrayList<Disciplina> recuperarDisciplina() {
		return this.disciplina;
	}
	
	
	@Override
	public void salvar(Turma t) {
		this.turma.add(t);
		
	}
	@Override
	public ArrayList<Turma> recuperarTurma() {
		return this.turma;
	}
	
	
	public Turma getTurma(String periodo, int codDisciplina, int numero){
		for(Turma t: this.turma){
			if(t.getPeriodo().equals(periodo)){
				if(t.getCodDisciplina()==codDisciplina){
					if(t.getNumero()==numero){
						return t;
					}
				}
			}
		}
		return null;
	}
		
	
	public Turma removerTurma(String periodo, int codDisciplina, int numero){
		for(Turma t: this.turma){
			if(t.getPeriodo().equals(periodo)){
				if(t.getCodDisciplina()==codDisciplina){
					if(t.getNumero()==numero){
						this.turma.remove(t);
						return t;
					}
				}
			}
		}
		return null;
	}
	
	
		
		
	
	@Override
	public void salva(Professor p) {
		this.professor.add(p);
		
	}
	@Override
	public ArrayList<Professor> recuperarProfessor() {
		return this.professor;
	}
	@Override
	public void salvar(Curso c) {
		this.curso.add(c);
		
	}
	@Override
	public ArrayList<Curso> recuperarCurso() {
		return this.curso;
	}
		
	
	
	
	
	

}
