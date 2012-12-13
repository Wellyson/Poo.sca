package poo.sca;
import poo.sca.io.*;

import java.util.Iterator;



public class SCAFacade extends SCAException{
	
	

	public SCAFacade(String msg) {
		super(msg);
		
	}

	SCAPersistenciaMemoria persistencia = new SCAPersistenciaMemoria();
	
	public Disciplina criarDisciplina(String nomeDisciplina, int numero)
		throws SCAException, SCARuntimeException{
		Disciplina d = new Disciplina(nomeDisciplina, numero);
		try{
			persistencia.salvar(d);
		}catch (SCAPersistenciaException e){
			throw new SCAException("tente salvar novamente");
		}
		
		return d;
	
	}
		
	public Professor criarProfessor(String nome, int matricula)
		throws SCAException, SCARuntimeException{
		Professor p = new Professor(nome, matricula);
		try {
			persistencia.salva(p);
		} catch (SCAPersistenciaException e) {
			throw new SCAException("tente salvar novamente");
			
		}
		return p;
		
	}
	
	public Curso criarCurso(String curso, int numero)
		throws SCAException, SCARuntimeException{
		Curso c = new Curso(curso, numero);
		try{
			persistencia.salvar(c);
		}catch (SCAPersistenciaException e){
			throw new SCAException ("tente salvar novamente");
		}
		return c;
	}
	
	public Turma criarTurma(Disciplina disciplina, int numero, String periodo)
		throws SCAException, SCARuntimeException{
		Turma t = new Turma(disciplina, numero, periodo);
		try{
			persistencia.salvar(t);
		}catch(SCAPersistenciaException e){
			throw new SCAException ("tente salvar novamente");
		}
		return t;
	}
	
	
	public Iterator<Disciplina> getDisciplinaIterator() throws SCAPersistenciaException{
		return this.persistencia.recuperarDisciplina().iterator();
	}

	public Iterator<Professor> getProfessorIterator()throws SCAPersistenciaException{
		return this.persistencia.recuperarProfessor().iterator();
	}
		
	public Iterator<Curso> getCursoIterator()throws SCAPersistenciaException{
		return this.persistencia.recuperarCurso().iterator();
	}
	
	public Iterator<Turma> getTurmaIterator()throws SCAPersistenciaException{
		return this.persistencia.recuperarTurma().iterator();
	}
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}