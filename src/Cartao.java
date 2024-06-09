public interface Cartao {
   public abstract  boolean validarNumero(String numero);
    public  abstract boolean validarCVC(String cvc);
    public abstract boolean validarNome(String nome);
    public abstract boolean validarDataExpiracao(int mes, int ano);
}
