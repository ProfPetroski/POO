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

        ContaPoupanca  minhaPoupanca = new ContaPoupanca("Luiz Pedro", 4, 3, 0.005);
        minhaPoupanca.imprimiExtrato();
        minhaPoupanca.depositar(459.25);
        minhaPoupanca.imprimiExtrato();
        minhaPoupanca.adicionaRendimento();
        minhaPoupanca.imprimiExtrato();

        minhaPoupanca.transfere(50.0, minhaCC);
        minhaPoupanca.imprimiExtrato();
        minhaCC.imprimiExtrato();
    }
}
