package br.com.samsung.teste;

import javax.swing.JOptionPane;

import br.com.samsung.model.Celular;
import br.com.samsung.model.LinhaBranca;

public class TesteSamsung {

	public static void main(String[] args) {

	/*	Celular cell = new Celular();
		
		cell.setNome("Samsung Galaxy 23");
		cell.setPeso(0.500);
		cell.setAlturaTela(18.5);
		cell.setLarguraTela(10.5);
		
		Celular cell2 = new Celular();
		
		String recebeNomeCELL2 = JOptionPane.showInputDialog("Nome");
		Double recebePesoCELL2 = Double.parseDouble(JOptionPane.showInputDialog("Peso em quilogramas"));
		Double recebeAlturaCELL2 = Double.parseDouble(JOptionPane.showInputDialog("Altura em cm"));
		Double recebeLarguraCELL2 = Double.parseDouble(JOptionPane.showInputDialog("Largura em cm"));
		
		cell2.setNome(recebeNomeCELL2);
		cell2.setPeso(recebePesoCELL2);
		cell2.setAlturaTela(recebeAlturaCELL2);
		cell2.setLarguraTela(recebeLarguraCELL2);
		
		System.out.println(" o " + cell.getNome() + " pesa " + cell.getPeso() +
				" kg e tem as dimensôes " + cell.getAlturaTela() + "x" + cell.getLarguraTela());
		
		LinhaBranca lb = new LinhaBranca();
		
		lb.setNome ("Batedeira");
		lb.setPeso(1.2);
		lb.setTipo("planetaria");
		
		System.out.println("A " + lb.getNome() + " pesa " + lb.getPeso() + " e é do tipo " + lb.getTipo());
		
		LinhaBranca lb2 = new LinhaBranca();
		
		String recebeNomeLB2 = JOptionPane.showInputDialog("Nome");
		Double recebePesoLB2 = Double.parseDouble(JOptionPane.showInputDialog("Peso em quilogramas"));
		String recebeTipoLB2 = JOptionPane.showInputDialog("Tipo");
		
		lb2.setNome(recebeNomeLB2);
		lb2.setPeso(recebePesoLB2);
		lb2.setTipo(recebeTipoLB2); */
		
		int menu = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao menu de manutenção samsung: \n"
				+ "Digite 1 para descrever um celular \n"
				+ "Digite 2 para descrever a linha branca")) ;
		
		if(menu == 1){
			Celular cell = new Celular();
			
			String recebeNomeCELL = JOptionPane.showInputDialog("Nome");
			Double recebePesoCELL = Double.parseDouble(JOptionPane.showInputDialog("Peso em quilogramas"));
			Double recebeAlturaCELL = Double.parseDouble(JOptionPane.showInputDialog("Altura em cm"));
			Double recebeLarguraCELL = Double.parseDouble(JOptionPane.showInputDialog("Largura em cm"));
			
			cell.setNome(recebeNomeCELL);
			cell.setPeso(recebePesoCELL);
			cell.setAlturaTela(recebeAlturaCELL);
			cell.setLarguraTela(recebeLarguraCELL);
			
			System.out.println(" o " + cell.getNome() + " pesa " + cell.getPeso() +
					" kg e tem as dimensôes " + cell.getAlturaTela() + "x" + cell.getLarguraTela());
		} else if(menu == 2) {
			LinhaBranca lb = new LinhaBranca();
			
			String recebeNomeLB = JOptionPane.showInputDialog("Nome");
			Double recebePesoLB = Double.parseDouble(JOptionPane.showInputDialog("Peso em quilogramas"));
			String recebeTipoLB = JOptionPane.showInputDialog("Tipo");
			
			lb.setNome(recebeNomeLB);
			lb.setPeso(recebePesoLB);
			lb.setTipo(recebeTipoLB);
			
			System.out.println("A " + lb.getNome() + " pesa " + lb.getPeso() + " e é do tipo " + lb.getTipo());

		} else {
			System.out.println("POXA!! \n Digite somente 1 ou 2");
		}
}
}