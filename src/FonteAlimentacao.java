public class FonteAlimentacao extends Produtos {

	private String tipo;
	
	public FonteAlimentacao(String nome, String marca, Double preco, String tipo) {
		super(nome, marca, preco);
		this.tipo= tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
