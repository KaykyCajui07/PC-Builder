import java.util.Scanner;


public class Pedido {
    private Estoque estoque = new Estoque();
    private Mouse mouse; 
    private PlacaVideo placavideo; 
    private Teclado teclado; 
    private Ram memoriaRam[] = new Ram[2]; 
    private Gabinete gabinete; 
    private FonteAlimentacao fonte; 
    private Monitor monitor[] = new Monitor[2];
    private Fone fone;
    private PlacaMae placaMae; 
    private Processador processador; 


    protected int cont = 0;

    public Pedido() {
      
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
            this.placavideo = estoque.getPlacadeVideo(num-1);
            
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
        if(this.processador == null){
            this.processador = estoque.getProcessador(num-1);
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
            this.memoriaRam[0] = estoque.getMemoriaRam(num-1);

        }
        else if(this.memoriaRam[1] == null){
            this.memoriaRam[1] = estoque.getMemoriaRam(num-1);
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
            this.monitor = estoque.getMonitor(num-1);
        }
        else if(this.monitor[1] == null){
            this.monitor = estoque.getMouse(num - 1);
        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public void addFonteAlimentacao(int num){
        if(this.fonte == null){
            this.fonte = estoque.getFonteAlimentacao(num-1);
        }
        else{
            System.out.println("Não é possivel adicionar mais produtos");
        }
    }

    public addFone(int num){
        if(this.fone == null){
            this.fone = estoque.getFone(num - 1);
        }
    }


    
    
    public double calculoTotal() {
        double total=0;
        total  = this.mouse.getPreco() + this.placavideo.getPreco();
        return total;
    }
    
    public double calculoDesc() {
        return calculoTotal()*0.9;
    }
    

    public void notaFiscal(int formaPagar) {
        System.out.println("Nota Fiscal:");
        System.out.println();
        System.out.println(this.mouse.getNome()+ "("+this.mouse.getMarca()+") = R$ "+this.mouse.getPreco());
        System.out.println(this.placavideo.getNome()+"("+this.placavideo.getMarca()+") = R$ "+this.placavideo.getPreco());
        

        double total= calculoTotal();
        
        switch (formaPagar) {
            case 1: 
                total= calculoDesc(); 
                System.out.println();
                System.out.println("Forma de pagamento: à vista");
                System.out.println("Total com desconto: R$" + total);
                System.out.println();
                break;
            case 2: 
                System.out.println();
                System.out.println("Forma de pagamento: cartão de crédito");
                System.out.println("Total: R$" + total);
                System.out.println();
                break;
            case 3: 
                System.out.println();
                System.out.println("Forma de pagamento: débito");
                System.out.println("Total: R$" + total);
                System.out.println();
                break;
            case 4: 
                System.out.println();
                System.out.println("Forma de pagamento: boleto");
                System.out.println("Total: R$" + total);
                System.out.println();
                break;
            case 5: 
                System.out.println("Forma de pagamento: Pix ");
                System.out.println("Total: R$ "+ total);
            default: 
                System.out.println("Opcao inválida, tente novamente");
        }
        System.out.println("Pagamento aprovado!");
    }


}
