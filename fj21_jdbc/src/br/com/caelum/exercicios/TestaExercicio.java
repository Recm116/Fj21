package br.com.caelum.exercicios;

public class TestaExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto("Televisão", 1, 1500.25);
		Produto p1 = new Produto("Som", 1, 1200.55);
		
		p.exibirInfo();
		p.adicionarEstoque(10);
		p.exibirInfo();
		p.removerEstoque(1);
		p.exibirInfo();
		
		p1.exibirInfo();
		p1.adicionarEstoque(15);
		p1.exibirInfo();
		p1.removerEstoque(1);
		p1.exibirInfo();
	}

}
