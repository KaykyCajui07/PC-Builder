public class Armazenamento extends Produtos {
    private int tamanho;
    private String modelo;
    public Armazenamento (String nome,String marca,double preco,int tamanho,String modelo){
        super(nome, marca,preco);
        this.tamanho = tamanho;
        this.modelo = modelo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public String getModelo() {
        return modelo;
    }

    
    
    
}
