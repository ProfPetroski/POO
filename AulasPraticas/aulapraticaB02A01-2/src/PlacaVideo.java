public class PlacaVideo extends Produto {
    private int memoria;
    private String saidasVideo;

    public PlacaVideo(String marca, String modelo, double preco, int memoria, String saidasVideo) {
        super(marca, modelo, preco);
        this.memoria = memoria;
        this.saidasVideo = saidasVideo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getSaidasVideo() {
        return saidasVideo;
    }

    public void setSaidasVideo(String saidasVideo) {
        this.saidasVideo = saidasVideo;
    }

    @Override
    public String toString() {
        String dadosPlacaVideo;
        dadosPlacaVideo = super.toString();
        dadosPlacaVideo +="Memória:\t"+ this.getMemoria()+"\n";
        dadosPlacaVideo +="Saidas de Vídeo:\t"+ this.getSaidasVideo()+"\n";
        return dadosPlacaVideo;
    }
}
