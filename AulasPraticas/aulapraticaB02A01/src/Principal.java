public class Principal {
    public static void main(String args[]){
        Agencia novaAgencia= new Agencia(1, 1000.0, 0.005);

        ContaCorrente contaLuiz = novaAgencia.novaContaCorrente("Luiz Pedro Petroski");
        System.out.println(contaLuiz.toString());
        ContaCorrente contaMaria = novaAgencia.novaContaCorrente("Maria da Silva");
        System.out.println(contaMaria);

        contaLuiz.depositar(500.0);
        contaMaria.depositar(1200.0);

        novaAgencia.cobrarTaxa(contaLuiz);

        double balanco = novaAgencia.balanco(novaAgencia.getListaContaCorrente());
        System.out.println(balanco);

    }
}
