public class Principal {
    public static void main(String args[]){
        Conta minhaConta = new Conta("Luiz Pedro Petroski", 4, 458);
        minhaConta.imprimiExtrato();

        ContaCorrente minhaCC = new ContaCorrente("Luiz Pedro", 5, 567, 800.0);
        minhaCC.imprimiExtrato();
        minhaCC.depositar(100.0);
        minhaCC.imprimiExtrato();
        minhaCC.sacar(900.0);
        minhaCC.imprimiExtrato();
        minhaCC.sacar(10.0);
        minhaCC.imprimiExtrato();

        //minhaCC.saldo = 1000000.0;
        //minhaCC.imprimiExtrato();
    }
}
