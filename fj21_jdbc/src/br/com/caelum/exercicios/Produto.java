package br.com.caelum.exercicios;

public class Produto {
	public String nome;
	public int quantidade;
	public double preco;
	
	public Produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public void adicionarEstoque(int qtd) {
		if (qtd <= 0) {
            System.out.println("A quantidade a ser adicionada deve ser maior que zero!");
            return;
        }
		this.quantidade += qtd;
		System.out.println("Quantidade adicionada ao estoque: " + qtd);
	}
	
	public void removerEstoque(int qtd2) {
		if (qtd2 <= 0) {
			System.out.println("A quantidade a ser removida deve ser maior que zero!");
            return;
		}
		if (this.quantidade >= qtd2) {
			this.quantidade -= qtd2;
			System.out.println("Quantidade removida do estoque: " + qtd2);
		} else {
			System.out.println("Operação inválida!");
		}
	}
	
	public double calcularEstoque() {
		return this.preco * this.quantidade;
	}
	
	public void exibirInfo() {
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Preço: " + this.calcularEstoque());
	}	
}
