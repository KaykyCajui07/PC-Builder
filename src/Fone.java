public class Fone extends Produtos{
    private String conexao;
    private boolean led;
    public Fone(String nome, String marca, double preco, String conexao, boolean led){
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