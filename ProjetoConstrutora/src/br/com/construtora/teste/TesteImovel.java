package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Apartamento;
import br.com.construtora.model.Casa;

public class TesteImovel {

	public static void main(String[] args) {
		
		int menu = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo a pesquisa do INSS: \n"
				+ "Digite 1 para dizer mais sobre sua casa \n"
				+ "Digite 2 para dizer mais sobre seu apartamento")) ;

		if(menu == 1)
		{
			Casa casa = new Casa();
			
			casa.setNome(JOptionPane.showInputDialog("Nome"));	
			casa.setMetrosQuadrados( Double.parseDouble(JOptionPane.showInputDialog("Metros Quadrados")));
			casa.setQuantidadeQuartos(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de quartos")));
			casa.setMetrosQuadradosGaragem(Double.parseDouble(JOptionPane.showInputDialog("Metros Quadrados da garagem")));
			
			System.out.println("" + casa.getNome() + "" + casa.getMetrosQuadrados() +"" + casa.getQuantidadeQuartos() + "" + casa.getMetrosQuadradosGaragem());
			
			
		}
		
		else if(menu == 2)
		{
			Apartamento apartamento = new Apartamento();
			
			apartamento.setNome(JOptionPane.showInputDialog("Nome"));	
			apartamento.setMetrosQuadrados( Double.parseDouble(JOptionPane.showInputDialog("Metros Quadrados")));
			apartamento.setQuantidadeQuartos(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de quartos")));
			apartamento.setQuantidadeDeVarandas(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de quartos")));
			
			System.out.println("" + apartamento.getNome() + "" + apartamento.getMetrosQuadrados() +"" + apartamento.getQuantidadeQuartos() + "" + apartamento.getQuantidadeDeVarandas());
			
			
		}
		
		else 
		{
			System.out.println("Você precisa digitar 1 ou 2");
		}
	}

}
