public class Monitor extends Produto{
    private int tamanhoTela;

    public Monitor(String marca, String modelo, double preco, int tamanhoTela){
        super(marca, modelo, preco);
        this.tamanhoTela=tamanhoTela;
    }

    public int getTamanhoTela(){
        return this.tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela){
        this.tamanhoTela=tamanhoTela;
    }

    @Override
    public String toString(){
        String dadosMonitor;
        dadosMonitor = super.toString();
        dadosMonitor +="Tamanho Tela:\t"+ this.getTamanhoTela()+"\n";
        return dadosMonitor;
    }


}
