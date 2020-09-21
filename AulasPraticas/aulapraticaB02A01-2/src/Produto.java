public class Produto {
    public String marca;
    public String modelo;
    public double preco;

    public Produto(String marca, String modelo, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.setPreco(preco);
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        if(preco>=0){
            this.preco=preco;
        }
        else{
            System.out.println("O preço é inválido");
        }
    }

    public String toString(){
        String dadosProduto;
        dadosProduto = "Marca:\t"+this.getMarca()+"\n";
        dadosProduto += "Modelo:\t"+this.getModelo()+"\n";
        dadosProduto += "Preço:\t"+this.getPreco()+"\n";
        return dadosProduto;
    }
}
