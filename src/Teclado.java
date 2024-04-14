public class Teclado extends Produtos{
    private String conexao;
    private boolean led;
    public Teclado(String nome, String marca, double preco, String conexao, boolean led){
        super(nome, marca, preco);
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