public class Computador extends Produto{
    private int memoria;
    private String processador;
    private int hd;

    public Computador(String marca, String modelo, double preco, int memoria, String processador, int hd){
        super(marca, modelo, preco);
        this.memoria = memoria;
        this.processador = processador;
        this.hd = hd;
    }

    public int getMemoria(){
        return this.memoria;
    }
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }

    //A fazer implementar os gets e sets de processador e hd
    @Override
    public String toString(){
        String dadosComputador;
        dadosComputador = super.toString();
        dadosComputador += "Memória:\t"+this.getMemoria()+"\n";
        dadosComputador += "Procesador:\t"+this.processador+"\n";
        dadosComputador += "HD        :\t"+this.hd+"\n";
        return dadosComputador;
    }

}
