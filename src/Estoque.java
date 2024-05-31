public class Estoque {
    private Processador[] processador = {
        new Processador("Ryzen 5 5600", "AMD", 788.98),
        new Processador("Ryzen 7 8700g", "AMD", 1899.99),
        new Processador("Ryzen 9 5900x", "AMD", 2229.90),
        new Processador("Core i3 14100", "Intel", 799.99),
        new Processador("Core i5 9400f", "Intel", 593.10),
        new Processador("Core i9 12900", "Intel", 2589.00)
    };

    private PlacaMae[] placaMae = {
        new PlacaMae("Gigabyte B550M ", "AMD", 599.99),
        new PlacaMae("Asus A620M", "AMD", 699.99),
        new PlacaMae("Asus X570-Plus", "AMD", 1799.99),
        new PlacaMae("MSI H610M", "Intel", 575.00),
        new PlacaMae("Gigabyte B760M", "Intel", 1085.43),
        new PlacaMae("ASRock H310M", "Intel", 299.00),
       
      
    };
    
    private Ram[] memoriaRAM = {
        new Ram("Fury", "Kingston", 159.99,"DDR4"),
        new Ram("Vengeance", "Corsair", 269.99,"DDR5")
    };

    private PlacaVideo[] placaDeVideo = {
        new PlacaVideo("Geforce RTX 3060", "Gigabyte", 1659.99,"12GB"),
        new PlacaVideo("Geforce GTX 1650", "MSI", 914.00,"4GB"),
        new PlacaVideo("Radeon RX 6600", "ASRock", 1299.99,"8GB"),
        new PlacaVideo("Radeon RX 580", "Sapphire", 559.00,"12GB")        
    };
    
    private  Armazenamento[] armazenamento = {
        new Armazenamento("SSD", "Samsung",459.00,256,"970 EVO Plus"),
        new Armazenamento("HDD", "Western Digital",229.99,1000,"HD Blue")
    };
    
    private FonteAlimentacao[] fonte = {
        new FonteAlimentacao("CX-750M", "Corsair", 649.99,750),
        new FonteAlimentacao("MAG-A650BN", "MSI", 279.99,650)
    };

    private Gabinete[] gabinete = {
        new Gabinete("Wave", "Rise Mode", 199.90,"Galaxy Glass M"),
        new Gabinete("Grapple", "Redragon", 239.90,"Grapple RGB "),
        new Gabinete("Cyclops", "DeepCool", 599.99,"Mid Tower")
    };
    
    private Mouse[] mouse = {
        new Mouse("Cobra", "Redragon", 119.99,"Sem fio",true),
        new Mouse("G Pro Wireless", "Logitech", 599.99,"Sem fio",false),
        new Mouse("Deathadder v2", "Razer", 270.94,"Com fio",false),
    };
    
    private Teclado[] teclado = {
        new Teclado("G512 Carbon", "Logitech", 549.99,"Com fio",false),
        new Teclado("Bora", "T-Dagger", 189.99,"Com fio",true),
        new Teclado("Alloy", "HyperX", 499.99,"Com fio",true)
    };

    private Fone[] fone = {
        new Fone("G335", "Logitech", 399.99,"Com fio",false),
        new Fone("Zeus X", "Redragon", 249.99,"Com fio",true),
        new Fone("Kraken", "Razer", 169.99,"Com fio",false)
    };

    private Monitor[] monitor = {
        new Monitor("Monitor 24'", "Dell", 999.99,2.7,2,75),
        new Monitor("UltraGear", "LG", 1263.15,19,10,144),
        new Monitor("Hero", "AOC", 899.10,32,21.2,144)
    };

    public Processador getProcessador(int num) {
        return processador[num];
    }

    public PlacaMae getPlacaMae(int num) {
        return placaMae[num];
    }

    public Ram getMemoriaRAM(int num) {
        return memoriaRAM[num];
    }

    public PlacaVideo getPlacaDeVideo(int num) {
        return placaDeVideo[num];
    }

    public Armazenamento getArmazenamento(int num) {
        return armazenamento[num];
    }

    public FonteAlimentacao getFonte(int num) {
        return fonte[num];
    }

    public Gabinete getGabinete(int num) {
        return gabinete[num];
    }

    public Mouse getMouse(int num) {
        return mouse[num];
    }

    public Teclado getTeclado(int num) {
        return teclado[num];
    }

    public Fone getFone(int num) {
        return fone[num];
    }

    public Monitor getMonitor(int num) {
        return monitor[num];
    }

    public void catalogoProcessadores() {
        System.out.println("Processadores:");
        System.out.println();
        for (int i = 0; i < processador.length; i++) {
            System.out.println(
                i+1+" - "+  this.processador[i].getNome() + " - " + this.processador[i].getMarca() + " = " + this.processador[i].getPreco());
        }
    }

    public void catalogoPlacasMaeAMD() {
        System.out.println("Placas Mãe:");
        System.out.println();
        for (int i = 0; i <= 2; i++) {
                System.out.println(
                    i+1+" - " +  this.placaMae[i].getNome() + " - " + this.placaMae[i].getMarca() + " = " + this.placaMae[i].getPreco());
            
         }
    }

    public void catalogoPlacasMaeIntel() {
        System.out.println("Placas Mãe:");
        System.out.println();
        for (int i = 3; i < placaMae.length; i++) {
                System.out.println(
                   i+1 +" - " + this.placaMae[i].getNome() + " - " + this.placaMae[i].getMarca() + " = " + this.placaMae[i].getPreco());
            
         }
    }


    

    
    public void catalogoMemoriasRAMDDR5() {
        System.out.println("Memórias RAM:");
        System.out.println();
        System.out.println("2 - "+this.memoriaRAM[1].getNome() + " - " + this.memoriaRAM[1].getMarca() + " = " + this.memoriaRAM[1].getPreco());

    }

    public void catalogoMemoriasRAMDDR4() {
        System.out.println("Memórias RAM:");
        System.out.println();
        System.out.println("1 - "+this.memoriaRAM[0].getNome() + " - " + this.memoriaRAM[0].getMarca() + " = " + this.memoriaRAM[0].getPreco());
    

    }
    public void catalogoPlacasDeVideo() {
        System.out.println("Placas De Vídeo:");
        System.out.println();
        
        for (int i = 0; i < placaDeVideo.length; i++) {
            System.out.println(
                i+1+" - "+ this.placaDeVideo[i].getNome() + " - " + this.placaDeVideo[i].getMarca() + " = " + this.placaDeVideo[i].getPreco());
        }
    }
    
    public void catalogoArmazenamentos() {
        System.out.println("Armazenamentos:");
        System.out.println();
        for (int i = 0; i < armazenamento.length; i++) {
            System.out.println(
                i+1+" - "+ this.armazenamento[i].getNome() + " " + this.armazenamento[i].getModelo() + " - " + this.armazenamento[i].getMarca() + " = " + this.armazenamento[i].getPreco());
        }
    }
    
    public void catalogoFontes() {
        System.out.println("Fontes:");
        System.out.println();
        for (int i = 0; i < fonte.length; i++) {
            System.out.println(
                i+1+" - " + fonte[i].getNome() + " - " + fonte[i].getMarca() + " = " + fonte[i].getPreco());
        }
    }

    public void catalogoGabinetes() {
        System.out.println("Gabinetes:");
        System.out.println();
        for (int i = 0; i < gabinete.length; i++) {
            System.out.println(
                i+1+" - "+this.gabinete[i].getNome() + " - " + this.gabinete[i].getMarca() + " = " + this.gabinete[i].getPreco());
        }
    }
    
    public void catalogoMouses() {
        System.out.println("Mouses:");
        System.out.println();
        for (int i = 0; i < mouse.length; i++) {
            System.out.println(
                i+1+" - "+ this.mouse[i].getNome() + " - " + this.mouse[i].getMarca() + " = " + this.mouse[i].getPreco());
        }
    }
    
    public void catalogoTeclados() {
        System.out.println("Teclados:");
        System.out.println();
        for (int i = 0; i < this.teclado.length; i++) {
            System.out.println(
                i+1+" - "+  this.teclado[i].getNome() + " - " + this.teclado[i].getMarca() + " = " + this.teclado[i].getPreco());
        }
    }

    public void catalogoFones() {
        System.out.println("Fones:");
        System.out.println();
        for (int i = 0; i < fone.length; i++) {
            System.out.println(
                i+1+" - "+  this.fone[i].getNome() + " - " + this.fone[i].getMarca() + " = " + this.fone[i].getPreco());
        }
    }

    public void catalogoMonitores() {
        System.out.println("Monitores:");
        System.out.println();
        for (int i = 0; i < this.monitor.length; i++) {
            System.out.println(
                i+1 +" - "+   this.monitor[i].getNome() + " - " + this.monitor[i].getMarca() + " = " + this.monitor[i].getPreco());
        }
    }
}

