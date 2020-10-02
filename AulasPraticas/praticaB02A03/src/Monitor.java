
public class Monitor extends Produto implements Promocionavel, Comparable {
    private int tamanhoTela;

    public Monitor(String marca, String modelo, double valorUnitario, int tamanhoTela){
        super(marca, modelo, valorUnitario);
        this.tamanhoTela = tamanhoTela;
    }

    public int getTamanhoTela(){
        return this.tamanhoTela;
    }
    public void setTamanhoTela(int tamanhoTela){
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String toString(){
        String dadosMonitor;
        dadosMonitor = super.toString();
        dadosMonitor += "Tamanho da Tela:\t\t"+this.tamanhoTela+"\n";
        return dadosMonitor;
    }

    public String descricaoPromocao(){
        String descricao = "Na compra de 3 ou mais unidades desconto de 10%";
        return descricao;
    }
    public double valorPromocional(int quantidade){
        if(quantidade>=3){
            return quantidade * this.getValorUnitario() * 0.9;
        }
        else{
            return quantidade * this.getValorUnitario();
        }
    }
    public int compareTo(Object other){
        Monitor otherMon = (Monitor)other;
        if(this.getValorUnitario()>otherMon.getValorUnitario()){
            return 1;
        }
        else if (this.getValorUnitario()<otherMon.getValorUnitario()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
