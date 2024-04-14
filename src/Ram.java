public class Ram extends Produtos {
    private String tipo;
    
    public Ram(String nome, String marca, Double preco, String tipo) {
        super(nome, marca, preco);
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.tipo = tipo;
    }

}
