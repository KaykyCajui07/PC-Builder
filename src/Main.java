import java.util.Scanner;

public class Main {

    public static void Inicio() {
        System.out.println("Bem vindo a do Garibaldo");
        System.out.println();
        System.out.println("Catalogo de Produtos:");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Pedido pedido = new Pedido();
        int opcao = 0;

        Inicio();
        while (true) {
            System.out.println("Escolha o processador: ");
            System.out.println();
            estoque.catalogoProcessadores();
            opcao = input.nextInt();
            pedido.addProcessador(opcao);

            System.out.println("Escolha Placa Mae:");
            if (pedido.getProcessador().getMarca() == "AMD") {
                estoque.catalogoPlacasMaeAMD();
            } else {
                estoque.catalogoPlacasMaeIntel();
            }

            opcao = input.nextInt();
            pedido.addPlacaMae(opcao);
            System.out.println();

            System.out.println("Escolha a Memoria Ram:");
            for (int i = 0; i < 2; i++) {
                if (pedido.getPlacaMae().getNome() == "Asus A620M"
                        || pedido.getPlacaMae().getNome() == "Gigabyte B760M") {
                    estoque.catalogoMemoriasRAMDDR5();
                    opcao = input.nextInt();
                    pedido.addMemoriaRam(opcao);

                } else {
                    estoque.catalogoMemoriasRAMDDR4();
                    opcao = input.nextInt();
                    pedido.addMemoriaRam(opcao);

                }
            }
            
            System.out.println("Escolha a Placa De Video");
            estoque.catalogoPlacasDeVideo();
            opcao = input.nextInt();
            pedido.addPlacaVideo(opcao);

            System.out.println("Escolha o Armazenamento");
            estoque.catalogoArmazenamentos();
            opcao = input.nextInt();
            pedido.addArmazenamento(opcao);
            
            System.out.println("Escolha a Fonte De Alimentacao: ");
            estoque.catalogoFontes();
            opcao = input.nextInt();
            pedido.addArmazenamento(opcao);

            System.out.println("Escolha o Gabinte: ");
            estoque.catalogoGabinetes();
            opcao = input.nextInt();
            pedido.addGabinete(opcao);

            System.out.println("Periféricos:");
            System.out.println("Escolha o mouse:");
            estoque.catalogoMouses();
            opcao = input.nextInt();
            pedido.addMouse(opcao);

            System.out.println("Escolha o Teclado: ");
            estoque.catalogoTeclados();
            opcao = input.nextInt();
            pedido.addTeclado(opcao);

            System.out.println("Escolha o Fone: ");
            estoque.catalogoFones();
            opcao = input.nextInt();
            pedido.addFone(opcao);

            System.out.println("Escolha o Monitor: ");
            estoque.catalogoMonitores();
            for(int i = 0;i<2;i++){
                estoque.catalogoMonitores();
                opcao = input.nextInt();
                pedido.addMonitor(opcao);
            }
        }
        /*
         * Processador
         * Placa Mãe
         * Memoria Ram
         * Placa de Video
         * Armazenamento
         * Fonte de Alimentação
         * Gabinte
         * Perifericos(mouse,teclado,fone,MOnitor)
         */

    }
}
