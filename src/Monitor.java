public class Monitor extends Produtos{
    private double altura;
    private double largura;
    private int taxaAtualizacao;

    public Monitor(String nome, String marca, double preco, double altura, double largura, int taxaAtualizacao){
        super(nome, marca, preco);
        this.altura = altura;
        this.largura = largura;
        this.taxaAtualizacao = taxaAtualizacao;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public int getTaxaAtualizacao(){
        return taxaAtualizacao;
    }
}