import java.util.Scanner;
import java.time.Year;
import java.time.YearMonth;

public class Pedido {
    private  Estoque estoque = new Estoque();
    private  Mouse mouse; 
    private  PlacaVideo placavideo; 
    private Teclado teclado; 
    private Ram memoriaRam[] = new Ram[2]; 
    private Gabinete gabinete; 
    private FonteAlimentacao fonte;
    private Monitor monitor[] = new Monitor[2];
    private  Fone fone;
    private PlacaMae placaMae; 
    private Processador processador; 
    private  Armazenamento armazenamento;


    
    public Pedido() {
      
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public PlacaVideo getPlacavideo() {
        return placavideo;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Ram getMemoriaRam(int num) {
        return memoriaRam[num];
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public FonteAlimentacao getFonte() {
        return fonte;
    }

    public Monitor getMonitor(int num) {
        return monitor[num];
    }

    public Fone getFone() {
        return fone;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public Processador getProcessador() {
        return processador;
    }



    public  void addArmazenamento(int num){
        if(armazenamento == null){
            armazenamento = estoque.getArmazenamento(num-1);
        }
        else{
            System.out.println("Não foi possivel adicionar mais produtos");
        }
    }
    
    public void addMouse (int num) {
        
        if(this.mouse == null) {
            this.mouse  = estoque.getMouse(num -1);
         
        }else {
            System.out.println("Não é possivel adicionar mais produtos.");
        }
    }

    public void addPlacaVideo (int num) {
        
        if(this.placavideo == null) {
            this.placavideo = estoque.getPlacaDeVideo(num-1);
            
        }else {
            System.out.println("Não é possivel adicionar mais produtos.");
        }
    }

    public void addTeclado(int num){
        if(this.teclado == null){
            this.teclado = estoque.getTeclado(num-1);

        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public void addProcessador(int num){
        if(processador == null){
            processador = estoque.getProcessador(num-1);
        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }
    
    public void addPlacaMae(int num){
        if(this.placaMae == null){
            this.placaMae = estoque.getPlacaMae(num-1);

        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public void addMemoriaRam(int num){
        if(this.memoriaRam[0] == null){
            this.memoriaRam[0] = estoque.getMemoriaRAM(num-1);

        }
        else if(this.memoriaRam[1] == null){
            this.memoriaRam[1] = estoque.getMemoriaRAM(num-1);
        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public void addGabinete(int num){
        if(this.gabinete == null){
            this.gabinete = estoque.getGabinete(num-1);
        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public void addMonitor(int num){
        if(this.monitor[0] == null){
            this.monitor[0] = estoque.getMonitor(num-1);
        }
        else if(this.monitor[1] == null){
            this.monitor[1] = estoque.getMonitor(num - 1);
        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public void addFonte(int num){
        if(this.fonte == null){
            this.fonte = estoque.getFonte(num-1);
        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public void addFone(int num){
        if(this.fone == null){
            this.fone = estoque.getFone(num - 1);
        }
    }

    public void passarCartao(int formaPagar){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String numeroCartao, cvc, nome; //para receber infos do cartao
        int mesCartao, anoCartao;
        int opcao = 0; //para entrar no loop
        YearMonth mesEAnoAtual = YearMonth.now();// Obtém o mês e o ano atuais do sistema
        int ano = mesEAnoAtual.getYear();
        int mes = mesEAnoAtual.getMonthValue();
        System.out.println("Digite as informações do cartão!\n");
        while(opcao == 0){
            System.out.print("Numero do cartão: ");
            numeroCartao = input.nextLine();
            if (numeroCartao.length() == 16)
                opcao = 1;
            else{
                System.out.println("ERRO: NUMERO OU TAMANHO INVÁLIDO");
                System.out.println("*É ESPERADO UM VALOR DE 16 CARACTERES*\n");
            }
        }

        opcao = 0;
        while(opcao == 0){
            System.out.println("--DATA de validade-- \n");
            System.out.print("Ano: ");
            anoCartao = input2.nextInt();
            System.out.print("Mes: ");
            mesCartao = input2.nextInt();
            if(anoCartao > ano && (mesCartao >= 1 && mesCartao <= 12))
                opcao = 1;
            else if(anoCartao == ano && (mesCartao >= mes && mesCartao <= 12))
                opcao = 1;
            else
                System.out.println("ERRO: DATA INVÁLIDA");
        }

        opcao = 0;
        while(opcao == 0){
            System.out.print("Código de segurança: ");
            cvc = input.nextLine();
            if (cvc.length() == 3)
                opcao = 1;
            else
                System.out.println("ERRO: CVC OU TAMANHO INVÁLIDO");
        }

        opcao = 0;
        while(opcao == 0){
            System.out.print("Nome: ");
            nome = input.nextLine();
            if (nome.length() > 0 && nome.length() <= 30)
                opcao = 1;
            else
                System.out.println("ERRO: NOME OU TAMANHO INVÁLIDO");
        }
        
        opcao = 0;
        if(formaPagar == 2){
            while (opcao == 0){
                System.out.print("Numero de parcelas(1-12): ");
                opcao = input.nextInt();
                if (opcao < 1 || opcao > 12){
                    opcao = 0;
                    System.out.println("ERRO: DIGITE UMA PARCELA VALIDA\n");
                }
            }
            System.out.printf("Valor da parcela: R$ %.2f \n",calcularParcela(opcao, calculoTotal()));
            input.close();
            input2.close();
        }
    }
    
    
    public double calculoTotal() {
        double total=0;
        total  = this.placavideo.getPreco() + this.fonte.getPreco() + this.gabinete.getPreco() + this.memoriaRam[0].getPreco() + 
                 this.memoriaRam[1].getPreco() + this.placaMae.getPreco() + this.processador.getPreco() + this.armazenamento.getPreco();
        if (this.mouse != null){
            total += this.mouse.getPreco();
        }
        if (this.fone != null){
            total += this.fone.getPreco();
        }
        if (this.monitor[0] != null){
            total += this.monitor[0].getPreco();
        }
        if (this.monitor[1] != null){
            total += this.monitor[1].getPreco();
        }
        if (this.teclado != null){
            total += this.teclado.getPreco();
        }
        return total;
    }
    
    public double calculoDesc() {
        return calculoTotal()*0.9;
    }
    
    private double calcularParcela(int parcelas,double total){
        double valorParcela = (double) total / parcelas;
        return valorParcela;
        
    }

    public void notaFiscal(int formaPagar) {

        double total= calculoTotal();
        
        switch (formaPagar) {
            case 1: 
                total= calculoDesc(); 
                System.out.println();
                System.out.println("Forma de pagamento: à vista");
                System.out.printf("Total com desconto: R$ %.2f\n", total);
                System.out.println();
                break;
            case 2: 
                System.out.println();
                System.out.println("Forma de pagamento: cartão de crédito");
                System.out.printf("Total: R$ %.2f\n", total);
                passarCartao(formaPagar); //pagar no credito(2)
                System.out.println();
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 3: 
                System.out.println();
                System.out.println("Forma de pagamento: débito");
                System.out.printf("Total: R$ %.2f\n", total);
                passarCartao(formaPagar); //pagar no debito(3)
                System.out.println();
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 4: 
                System.out.println();
                System.out.println("Forma de pagamento: boleto");
                System.out.printf("Total: R$ %.2f\n", total);
                System.out.println();
                break;
            case 5: 
                System.out.println("Forma de pagamento: Pix ");
                System.out.printf("Total: R$ %.2f\n", total);
                System.out.println();
                break;
            default: 
                System.out.println("Opcao inválida, tente novamente");
        }
        System.out.println("Pagamento aprovado!");

        System.out.println("|-------------------------Nota Fiscal-------------------------|");
        System.out.println();
        System.out.println(this.processador.getNome()+" - "+this.processador.getMarca()+" = R$ "+this.processador.getPreco());
        System.out.println(this.placaMae.getNome()+" - "+this.placaMae.getMarca()+" = R$ "+this.placaMae.getPreco());
        System.out.println(this.memoriaRam[0].getNome()+" - "+this.memoriaRam[0].getMarca()+" = R$ "+this.memoriaRam[0].getPreco());
        System.out.println(this.memoriaRam[1].getNome()+" - "+this.memoriaRam[1].getMarca()+" = R$ "+this.memoriaRam[1].getPreco());
        System.out.println(this.placavideo.getNome()+" - "+this.placavideo.getMarca()+" = R$ "+this.placavideo.getPreco());
        System.out.println(this.armazenamento.getNome()+" - "+this.armazenamento.getMarca()+" = R$ "+this.armazenamento.getPreco());
        System.out.println(this.fonte.getNome()+" - "+this.fonte.getMarca()+" = R$ "+this.fonte.getPreco());
        System.out.println(this.gabinete.getNome()+" - "+this.gabinete.getMarca()+" = R$ "+this.gabinete.getPreco());
        if (this.mouse != null){
            System.out.println(this.mouse.getNome()+" - "+this.mouse.getMarca()+" = R$ "+this.mouse.getPreco());
        }
        if (this.teclado != null){
            System.out.println(this.teclado.getNome()+" - "+this.teclado.getMarca()+" = R$ "+this.teclado.getPreco());
        }
        if (this.fone != null){
            System.out.println(this.fone.getNome()+" - "+this.fone.getMarca()+" = R$ "+this.fone.getPreco());
        }
        if (this.monitor[0] != null){
            System.out.println(this.monitor[0].getNome()+" - "+this.monitor[0].getMarca()+" = R$ "+this.monitor[0].getPreco());
        }
        if (this.monitor[1] != null){
            System.out.println(this.monitor[0].getNome()+" - "+this.monitor[0].getMarca()+" = R$ "+this.monitor[0].getPreco());
        }
    }
}
