package br.com.escola.beans.model;

public class Professor extends Pessoa {
	private float salario;
	private String cursoAlocado;
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCursoAlocado() {
		return cursoAlocado;
	}
	public void setCursoAlocado(String cursoAlocado) {
		this.cursoAlocado = cursoAlocado;
	}
	
	
}
