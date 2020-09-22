public class Caminhao extends Veiculo{
    int cargaMaxima;
    int numeroEixos;

    public Caminhao(String placa, String marca, String modelo, int cargaMaxima, int numeroEixos){
        super(placa, marca, modelo);
        this.cargaMaxima = cargaMaxima;
        this.numeroEixos = numeroEixos;
    }

    //TO-DO implementar gets e sets

    public double calcularTotal(int horas){
        return 5.0*horas*this.numeroEixos;
    }
}
