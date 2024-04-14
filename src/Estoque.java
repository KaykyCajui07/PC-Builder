public class Estoque {
        private Mouse mouse[] = {
             new Mouse("Mouse", "Ketchup",28.0)
         };
         private PlacaVideo PlacadeVideo[] = {
             new PlacaVideo("Rtx 3060 force","Nvidia", 280.90,""),
             new PlacaVideo("Rtx 3060 force","Nvidia", 280.90,"")
         };
         private Teclado teclado[] = {
            new Teclado("Teclado normal","BOM TODO",118)};
     
         
         public Mouse getMouse(int num) {
             return this.mouse[num];
         }
         public PlacaVideo getPlacadeVideo(int num) {
             return this.PlacadeVideo[num];
     
         }

         public Teclado getTeclado(int num){
            return this.teclado[num];
         }

         public void catalogoMouses(){
            System.out.println("MOUSES: ");
            System.out.println();
            
            for(int i = 0;i<mouse.length;i++){
                System.out.println(this.mouse[i].getNome()+"- "+this.mouse[i].getMarca()+" = "+this.mouse[i].getPreco());
            }
         }

         public void catalogoPlacaVideo(){
            System.out.println("Placas De Video: ");
            System.out.println();
            
         }
     
         
     
         
     
     
     }
     