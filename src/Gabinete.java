public class Gabinete extends Produtos{
    private String tipoGabinete;
	
	public Gabinete(String nome, String marca, Double preco, String tipoGabinete) {
		super(nome, marca, preco);
		this.tipoGabinete= tipoGabinete;
	}

	public String getTipoGabinete() {
		return tipoGabinete;
	}

	public void setTipoGabinete(String tipoGabinete) {
		this.tipoGabinete = tipoGabinete;
	}
	
	

}
