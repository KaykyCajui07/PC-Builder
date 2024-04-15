
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
    private Armazenamento armazenamento;


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

    public int getCont() {
        return cont;
    }


    protected int cont = 0;

    public Pedido() {
      
    }

    public void addArmazenamento(int num){
        if(this.armazenamento == null){
            this.armazenamento = estoque.getArmazenamento(num-1);
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


    
    
    public double calculoTotal() {
        double total=0;
        total  = this.mouse.getPreco() + this.placavideo.getPreco() + this.fone.getPreco() + this.fonte.getPreco() + this.monitor[0].getPreco()
                 + this.monitor[1].getPreco() + this.gabinete.getPreco() + this.memoriaRam[0].getPreco() + this.memoriaRam[1].getPreco()
                 + this.placaMae.getPreco() + this.processador.getPreco() + this.teclado.getPreco();
        return total;
    }
    
    public double calculoDesc() {
        return calculoTotal()*0.9;
    }
    

    public void notaFiscal(int formaPagar) {
        System.out.println("Nota Fiscal:");
        System.out.println();
        System.out.println(this.processador.getNome()+" - "+this.processador.getMarca()+" = R$ "+this.processador.getPreco());
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
