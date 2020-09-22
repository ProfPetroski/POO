abstract class Veiculo {
    protected String placa;
    private String marca;
    private String modelo;

    public Veiculo(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    //TO-DO implementar os gets e sets dos atributos

    public void registrarEntrada(){
        System.out.println("Entrada do veículo de placa: "+this.placa);
    }

    abstract double calcularTotal(int horas);
}
