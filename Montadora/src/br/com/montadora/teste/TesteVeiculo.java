package br.com.montadora.teste;

import br.com.montadora.model.Carro;

public class TesteVeiculo {

	public static void main(String[] args) {

		Carro carro = new Carro ();
		
		carro.setNome("Celta");
		carro.setQuantidadeJanela(4);
		carro.setCor("prata");
		
		System.out.println("O modelo do carro é: " + carro.getNome() +
				"\nA cor do carro é: " + carro.getCor());
		
	}

}
