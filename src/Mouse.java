public class Mouse extends Produtos{
    private String conexao;
    private boolean led;
    public Mouse(String nome,String marca,double preco, String conexao, boolean led){
        super(nome, marca, preco);
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.conexao = conexao;
        this.led = led;
    }
    public String getConexao() {
        return conexao;
    }

    public boolean isLed() {
        return led;
    }

}
