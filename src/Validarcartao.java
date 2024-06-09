import java.time.Year;
import java.time.YearMonth;

public class Validarcartao implements Cartao {
    
    
    @Override
    public boolean validarNumero(String numero) {
        return numero.matches("\\d{16}");
    }

    @Override
    public boolean validarCVC(String cvc) {
        return cvc.matches("\\d{3}");
    }

    @Override
    public boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    @Override
    public boolean validarDataExpiracao(int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        int anoAtual = Year.now().getValue();
        if (ano < anoAtual) {
            return false;
        } else if (ano == anoAtual) {
            int mesAtual = YearMonth.now().getMonthValue();
            return mes >= mesAtual;
        }
        return true;
    }
}
