public class FonteAlimentacao extends Produtos {
	private int potencia;
	public FonteAlimentacao(String nome, String marca, double preco,int potencia ) {
		super(nome, marca, preco);
		this.potencia = potencia;
	}
}
