package br.com.escola.teste;

import javax.swing.JOptionPane;

import br.com.escola.beans.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		String recebeNome = JOptionPane.showInputDialog("Nome");
		int recebeIdade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		String recebeRM = JOptionPane.showInputDialog("RM");
		String recebeCursoAlocado = JOptionPane.showInputDialog("Curso Alocado");
		
		aluno.setNome(recebeNome);
		aluno.setIdade(recebeIdade);
		aluno.setRM(recebeRM);
		aluno.setCursoAlocado(recebeCursoAlocado);
		
		System.out.println(" O nome do aluno é: " + aluno.getNome() + 
				"\n A idade do aluno(a) é: " + aluno.getIdade() + 
				"\n O rm do aluno(a) é: " + aluno.getRM() +
				"\n O curso do aluno(a) é: " + aluno.getCursoAlocado());
		
		//Outro objeto 
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Vinicius");
		aluno2.setIdade(20);
		aluno2.setRM("180158");
		aluno2.setCursoAlocado("Desenvolvimento de Sistemas");
		
		System.out.println("\n O nome do aluno é: " + aluno2.getNome() + 
				"\n A idade do aluno(a) é: " + aluno2.getIdade() + 
				"\n O rm do aluno(a) é: " + aluno2.getRM() +
				"\n O curso do aluno(a) é: " + aluno2.getCursoAlocado());
		
		
	}

}
