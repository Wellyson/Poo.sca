package poo.sca.io;
import java.util.ArrayList;
import poo.sca.Disciplina;
import poo.sca.Turma;
import poo.sca.Professor;
import poo.sca.Curso;

public interface SCAPersistencia {
	
	void salvar(Disciplina d) throws SCAPersistenciaException; 
	
	ArrayList<Disciplina> recuperarDisciplina() throws SCAPersistenciaException;
	
	void salvar(Turma t) throws SCAPersistenciaException;
	
	ArrayList<Turma> recuperarTurma() throws SCAPersistenciaException;
	
	void salva(Professor p)throws SCAPersistenciaException;
	
	ArrayList<Professor> recuperarProfessor()throws SCAPersistenciaException;
	
	void salvar(Curso c)throws SCAPersistenciaException;
	
	ArrayList<Curso> recuperarCurso()throws SCAPersistenciaException;
	
	

}
