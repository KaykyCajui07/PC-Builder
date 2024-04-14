public class Estoque {
    private Processador[] processadores = {
        new Processador("Ryzen 5 5600", "AMD", 788.98),
        new Processador("Ryzen 7 8700g", "AMD", 1899.99),
        new Processador("Ryzen 9 5900x", "AMD", 2229.90),
        new Processador("Core i3 14100", "Intel", 799.99),
        new Processador("Core i5 9400f", "Intel", 593.10),
        new Processador("Core i9 12900", "Intel", 2589.00)
    };

    private PlacaMae[] placasMae = {
        new PlacaMae("B550M", "Gigabyte", 599.99),
        new PlacaMae("A620M", "Asus", 699.99),
        new PlacaMae("X570-Plus", "Asus", 1799.99),
        new PlacaMae("H610M", "MSI", 575.00),
        new PlacaMae("H310M", "ASRock", 299.00),
        new PlacaMae("B760M", "Gigabyte", 1085.43)
    };
    
    private Ram[] memoriaRAM = {
        new MemoriaRAM("Fury", "Kingston", 159.99,"DDR4"),
        new MemoriaRAM("Vengeance", "Corsair", 269.99,"DDR5")
    };

    private PlacaVideo[] placasDeVideo = {
        new PlacaVideo("Geforce RTX 3060", "Gigabyte", 1659.99),
        new PlacaVideo("Geforce GTX 1650", "MSI", 914.00),
        new PlacaVideo("Radeon RX 6600", "ASRock", 1299.99),
        new PlacaVideo("Radeon RX 580", "Sapphire", 559.00)        
    };
    
    private Armazenamento[] armazenamentos = {
        new Armazenamento("SSD", "970 EVO Plus", "Samsung", 459.00),
        new Armazenamento("HDD", "WD Blue", "Western Digital", 229.99)
    };
    
    private Fonte[] fontes = {
        new Fonte("CX-750M", "Corsair", 649.99),
        new Fonte("MAG-A650BN", "MSI", 279.99)
    };

    private Gabinete[] gabinetes = {
        new Gabinete("Wave", "Rise Mode", 199.90),
        new Gabinete("Grapple", "Redragon", 239.90),
        new Gabinete("Cyclops", "DeepCool", 599.99)
    };
    
    private Mouse[] mouses = {
        new Mouse("Cobra", "Redragon", 119.99),
        new Mouse("G Pro Wireless", "Logitech", 599.99),
        new Mouse("Deathadder v2", "Razer", 270.94)
    };
    
    private Teclado[] teclados = {
        new Teclado("G512 Carbon", "Logitech", 549.99),
        new Teclado("Bora", "T-Dagger", 189.99),
        new Teclado("Alloy", "HyperX", 499.99)
    };

    private Fone[] fones = {
        new Fone("G335", "Logitech", 399.99),
        new Fone("Zeus X", "Redragon", 249.99),
        new Fone("Kraken", "Razer", 169.99)
    };

    private Monitor[] monitores = {
        new Monitor("Monitor 24'", "Dell", 999.99),
        new Monitor("UltraGear", "LG", 1263.15),
        new Monitor("Hero", "AOC", 899.10)
    };

    public Processador getProcessadores(int num) {
        return processadores[num];
    }

    public PlacaMae getPlacasMae(int num) {
        return placasMae[num];
    }

    public Ram getMemoriasRAM(int num) {
        return memoriasRAM[num];
    }

    public PlacaVideo getPlacasDeVideo(int num) {
        return placasDeVideo[num];
    }

    public Armazenamento getArmazenamentos(int num) {
        return armazenamentos[num];
    }

    public Fonte getFontes(int num) {
        return fontes[num];
    }

    public Gabinete getGabinetes(int num) {
        return gabinetes[num];
    }

    public Mouse getMouses(int num) {
        return mouse[num];
    }

    public Teclado getTeclados(int num) {
        return teclados[num];
    }

    public Fone getFones(int num) {
        return fones[num];
    }

    public Monitor getMonitores(int num) {
        return monitores[num];
    }

    public void catalogoProcessadores() {
        System.out.println("Processadores:");
        System.out.println();
        for (int i = 0; i < processadores.length; i++) {
            System.out.println(
                processadores[i].getNome() + " - " + processadores[i].getMarca() + " = " + processadores[i].getPreco());
        }
    }

    public void catalogoPlacasMae() {
        System.out.println("Placas Mãe:");
        System.out.println();
        for (int i = 0; i < placasMae.length; i++) {
            System.out.println(
                placasMae[i].getNome() + " - " + placasMae[i].getMarca() + " = " + placasMae[i].getPreco());
        }
    }
    
    public void catalogoMemoriasRAM() {
        System.out.println("Memórias RAM:");
        System.out.println();
        for (int i = 0; i < memoriasRAM.length; i++) {
            System.out.println(
                memoriasRAM[i].getNome() + " - " + memoriasRAM[i].getMarca() + " = " + memoriasRAM[i].getPreco());
        }
    }

    public void catalogoPlacasDeVideo() {
        System.out.println("Placas De Vídeo:");
        System.out.println();
        for (int i = 0; i < placasDeVideo.length; i++) {
            System.out.println(
                placasDeVideo[i].getNome() + " - " + placasDeVideo[i].getMarca() + " = " + placasDeVideo[i].getPreco());
        }
    }
    
    public void catalogoArmazenamentos() {
        System.out.println("Armazenamentos:");
        System.out.println();
        for (int i = 0; i < armazenamentos.length; i++) {
            System.out.println(
                armazenamentos[i].getTipo() + " " + armazenamentos[i].getModelo() + " - " + armazenamentos[i].getMarca() + " = " + armazenamentos[i].getPreco());
        }
    }
    
    public void catalogoFontes() {
        System.out.println("Fontes:");
        System.out.println();
        for (int i = 0; i < fontes.length; i++) {
            System.out.println(
                fontes[i].getModelo() + " - " + fontes[i].getMarca() + " = " + fontes[i].getPreco());
        }
    }

    public void catalogoGabinetes() {
        System.out.println("Gabinetes:");
        System.out.println();
        for (int i = 0; i < gabinetes.length; i++) {
            System.out.println(
                gabinetes[i].getNome() + " - " + gabinetes[i].getMarca() + " = " + gabinetes[i].getPreco());
        }
    }
    
    public void catalogoMouses() {
        System.out.println("Mouses:");
        System.out.println();
        for (int i = 0; i < mouses.length; i++) {
            System.out.println(
                mouses[i].getNome() + " - " + mouses[i].getMarca() + " = " + mouses[i].getPreco());
        }
    }
    
    public void catalogoTeclados() {
        System.out.println("Teclados:");
        System.out.println();
        for (int i = 0; i < teclados.length; i++) {
            System.out.println(
                teclados[i].getNome() + " - " + teclados[i].getMarca() + " = " + teclados[i].getPreco());
        }
    }

    public void catalogoFones() {
        System.out.println("Fones:");
        System.out.println();
        for (int i = 0; i < fones.length; i++) {
            System.out.println(
                fones[i].getNome() + " - " + fones[i].getMarca() + " = " + fones[i].getPreco());
        }
    }

    public void catalogoMonitores() {
        System.out.println("Monitores:");
        System.out.println();
        for (int i = 0; i < monitores.length; i++) {
            System.out.println(
                monitores[i].getNome() + " - " + monitores[i].getMarca() + " = " + monitores[i].getPreco());
        }
    }
}
