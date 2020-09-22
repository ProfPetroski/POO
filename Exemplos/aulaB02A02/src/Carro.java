public class Carro extends Veiculo {
    private int numeroPassageiros;

    public Carro(String placa, String marca, String modelo, int numeroPassageiros){
        super(placa, marca, modelo);
        this.numeroPassageiros = numeroPassageiros;
    }

    //TO-DO implementar get e sets

    public double calcularTotal(int horas){
        return 5.0*horas;
    }
}
