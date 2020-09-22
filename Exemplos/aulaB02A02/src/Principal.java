public class Principal {
    public static void main(String args[]){
        //Veiculo meuVeiculo = new Veiculo("AAA-1111", "VW", "GOL");
        Carro meuCarro = new Carro("AAA-1111", "VW", "GOL", 5);
        meuCarro.registrarEntrada();
        System.out.println(meuCarro.calcularTotal(10));

        Caminhao meuCaminhao = new Caminhao("BBB-2222", "VOLVO", "FH", 28, 9);
        meuCaminhao.registrarEntrada();
        System.out.println(meuCaminhao.calcularTotal(10));

        Moto minhaMoto = new Moto("CCC-3333", "Honda", "CG");
        minhaMoto.registrarEntrada();
        System.out.println(minhaMoto.calcularTotal(10));

    }
}
