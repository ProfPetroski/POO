public class Principal {
    public static void main(String args[]){
        Agencia novaAgencia= new Agencia(1, 1000.0, 0.005);
        novaAgencia.novaContaCorrente("Luiz Pedro Petroski");
        novaAgencia.novaContaCorrente("Maria da Silva");
        novaAgencia.novaContaPoupanca("Pedro da Silva");
        novaAgencia.novaContaPoupanca("Julia da Silva");

        novaAgencia.getListaContaPoupanca()[0].depositar(400.61);
        novaAgencia.getListaContaPoupanca()[1].depositar(800.10);
        novaAgencia.getListaContaCorrente()[0].depositar(2400.97);
        novaAgencia.getListaContaCorrente()[1].depositar(1345.32);

        novaAgencia.cobrarTaxa(novaAgencia.getListaContaPoupanca()[0]);
        novaAgencia.cobrarTaxa(novaAgencia.getListaContaCorrente()[0]);

        double balancoC = novaAgencia.balanco(novaAgencia.getListaContaCorrente());
        System.out.println(balancoC);
        double balancoP = novaAgencia.balanco(novaAgencia.getListaContaPoupanca());
        System.out.println(balancoP);

    }
}
