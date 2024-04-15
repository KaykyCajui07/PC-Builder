import java.util.Scanner;

public class Main {

    public static void Inicio(){
        String lixo;
        Scanner input = new Scanner(System.in);
        System.out.print("Bem vindo a GalegoHardware (a maior loja de tecnologia da américa latina)\n");
        lixo = input.nextLine();
        System.out.println("Monte o seu PC!");        
    }

    public static void Pagar(Pedido pedido){
        int opcao;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a forma de pagamento: ");
        System.out.println("1 - à vista");
        System.out.println("2 - cartão de crédito");
        System.out.println("3 - débito");
        System.out.println("4 - boleto");
        System.out.println("5 - Pix ");
        opcao = input.nextInt();
        pedido.notaFiscal(opcao);
        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Pedido pedido = new Pedido();
        int opcao = 0;

        Inicio();
        System.out.println();
        while (opcao == 0){
            estoque.catalogoProcessadores();
            System.out.print("\nEscolha o processador: ");
            opcao = input.nextInt();
            if (opcao <= 6 && opcao >= 1){
                pedido.addProcessador(opcao);

            }
            else{
                System.out.println("ERRO: VALOR INVALIDO\n");
                opcao = 0;
            }
        }

        opcao = 0;
        while(opcao == 0){
            if (pedido.getProcessador().getMarca() == "AMD") {
                    estoque.catalogoPlacasMaeAMD();
                    System.out.print("\nEscolha Placa Mae:");
                    opcao = input.nextInt();
                    if (opcao >= 1 && opcao <= 3){
                        pedido.addPlacaMae(opcao);
                    }
                    else{
                        System.out.println("ERRO: VALOR INVALIDO\n");
                        opcao = 0;
                    }
                }
            else {
                    estoque.catalogoPlacasMaeIntel();
                    System.out.print("\nEscolha Placa Mae:");
                    opcao = input.nextInt();
                    if (opcao >= 4 && opcao <= 6){
                        pedido.addPlacaMae(opcao);
                    }
                    else{
                        System.out.println("ERRO: VALOR INVALIDO\n");
                        opcao = 0;
                    }
                }

            System.out.println();
        }

        opcao = 0;
        while (opcao == 0){
        for (int i = 0; i < 2; i++) {
            if (pedido.getPlacaMae().getNome() == "Asus A620M"
                || pedido.getPlacaMae().getNome() == "Gigabyte B760M") {
                estoque.catalogoMemoriasRAMDDR5();
                System.out.print("\nEscolha a Memoria Ram: ");
                opcao = input.nextInt();
                if (opcao == 2){
                    pedido.addMemoriaRam(opcao);
                }
                else{
                    System.out.println("ERRO: VALOR INVALIDO\n");
                    opcao = 0;
                }

            } else {
                    estoque.catalogoMemoriasRAMDDR4();
                    System.out.print("\nEscolha a Memoria Ram: ");
                    opcao = input.nextInt();
                    if (opcao == 1){
                        pedido.addMemoriaRam(opcao);
                    }
                    else{
                        System.out.println("ERRO: VALOR INVALIDO\n");
                        opcao = 0;
                    }
                }
            }
        }
        opcao = 0;
        while(opcao == 0){
            estoque.catalogoPlacasDeVideo();
            System.out.print("\nEscolha a Placa De Video: ");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 4){
                pedido.addPlacaVideo(opcao);
            }
            else{
                System.out.println("ERRO: VALOR INVALIDO\n");
                opcao = 0; 
            }
        }

        opcao = 0;
        while (opcao == 0){
            estoque.catalogoArmazenamentos();
            System.out.print("\nEscolha o Armazenamento");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 2){
                pedido.addArmazenamento(opcao);
            }
            else{
                System.out.println("ERRO: VALOR INVALIDO\n");
                opcao = 0;
            }
        }
        
        opcao = 0;
        while(opcao == 0){
            estoque.catalogoFontes();
            System.out.print("\nEscolha a Fonte De Alimentacao: ");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 2){
                pedido.addFonte(opcao);
            }
            else{
                System.out.println("ERRO: VALOR INVALIDO\n");
                opcao = 0;
            }
        }

        opcao = 0;
        while(opcao == 0){
            estoque.catalogoGabinetes();
            System.out.print("\nEscolha o Gabinte: ");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 3){
                pedido.addGabinete(opcao);
            }
            else{
                System.out.println("ERRO: VALOR INVALIDO\n");
                opcao = 0;
            }
        }

        System.out.println("\nPeriféricos:\n");
        estoque.catalogoMouses();
        System.out.print("\nEscolha o mouse:");
        opcao = input.nextInt();
        pedido.addMouse(opcao);

        estoque.catalogoTeclados();
        System.out.print("\nEscolha o Teclado: ");
        opcao = input.nextInt();
        pedido.addTeclado(opcao);

        estoque.catalogoFones();
        System.out.print("\nEscolha o Fone: ");
        opcao = input.nextInt();
        pedido.addFone(opcao);

        estoque.catalogoMonitores();
        for(int i = 0;i<2;i++){
            estoque.catalogoMonitores();
            System.out.print("\nEscolha o Monitor: ");
            opcao = input.nextInt();
            pedido.addMonitor(opcao);
        }
        Pagar(pedido);
        input.close();
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

