package br.com.escola.beans.model;

public class Aluno extends Pessoa {
	private String RM;
	private String cursoAlocado;
	
	public String getRM() {
		return RM;
	}
	public void setRM(String rM) {
		RM = rM;
	}
	public String getCursoAlocado() {
		return cursoAlocado;
	}
	public void setCursoAlocado(String cursoAlocado) {
		this.cursoAlocado = cursoAlocado;
	}
	
	
}
