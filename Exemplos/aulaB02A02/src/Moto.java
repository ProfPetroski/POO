public class Moto extends Veiculo{

    public Moto(String placa, String marca, String modelo){
        super(placa, marca, modelo);
    }

    @Override
    public void registrarEntrada(){
        System.out.println("Entrada da Moto de placa: "+super.placa);
    }

    public double calcularTotal(int horas){
        return 3.0*horas;
    }
}
