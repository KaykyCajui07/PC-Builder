public abstract class  Produtos {
        protected String nome;
        protected String marca;
        protected double preco;
    
        
    
        public Produtos(String nome, String marca, double preco) {
            this.nome = nome;
            this.marca = marca;
            this.preco = preco;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public Double getPreco() {
            return preco;
        }
        public void setPreco(Double preco) {
            this.preco = preco;
        }
    
        
    }
    

