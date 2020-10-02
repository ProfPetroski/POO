public abstract class Produto {
    private String marca;
    private String modelo;
    private double valorUnitario;

    public Produto(String marca, String modelo, double valorUnitario){
        this.marca = marca;
        this.modelo = modelo;
        this.valorUnitario = valorUnitario;
    }

    public String toString(){
        String dadosProduto;
        dadosProduto = "Marca:\t\t"+this.marca+"\n";
        dadosProduto += "Modelo:\t\t"+this.modelo+"\n";
        dadosProduto += "Valor Unitário:\t\t"+this.valorUnitario+"\n";
        return dadosProduto;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }

    public double getValorUnitario(){
        return this.valorUnitario;
    }

    public void setValorUnitario(double valorUnitario){
        this.valorUnitario=valorUnitario;
    }
}
