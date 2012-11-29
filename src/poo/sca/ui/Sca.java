package poo.sca.ui;
import java.util.Iterator;
import java.util.Scanner;

import poo.sca.Disciplina;
import poo.sca.Professor;
import poo.sca.SCAFacade;
import poo.sca.Turma;
public class Sca {

	public static void main(String[] args) {
		
		Sca user = new Sca();
		
		Professor p = new Professor("depaula", 010101);

		SCAFacade facade = new SCAFacade();
		
		
	
	
		 facade.criarDisciplina("poo", 121212);
		 facade.criarDisciplina("ED", 232323);
		
		 Iterator<Disciplina> t = facade.getDisciplinaIterator();
		
		 while(t.hasNext()){
			 System.out.println(t.next().toString());
			 
		 }
		 
		
		
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void exibirMenuDisciplina() {
		
		System.out.println("----------------------MENU DISCIPLINA-----------------------");
		System.out.println(" PARA CRIAR UMA DISCIPLINA DIGITE: ");
		
		
	}
	
	public String lerEntradaUsuario(String pergunta){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o nome");
		String disciplina = entrada.next();
		System.out.println("digite o codigo");
		int codigo = entrada.nextInt();
		return disciplina;
	}
	

}
