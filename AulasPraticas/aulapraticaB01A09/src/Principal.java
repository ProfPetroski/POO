public class Principal {
    public static void main(String args[]){
        System.out.println("[Log] =>Criando uma conta genérica e imprimindo o extrato\n");
        Conta minhaConta = new Conta("Luiz Pedro Petroski", 4, 458);
        minhaConta.imprimiExtrato();

        System.out.println("[Log] =>Criando uma Conta Corrente, imprimindo o extrato, depositando 100, extrato, saque 897.00 e extrato\n");
        ContaCorrente minhaCC = new ContaCorrente("Luiz Pedro", 5, 567, 800.0);
        minhaCC.imprimiExtrato();
        minhaCC.depositar(100.0);
        minhaCC.imprimiExtrato();
        minhaCC.sacar(897.0);
        minhaCC.imprimiExtrato();
        minhaCC.sacar(10.0);
        minhaCC.imprimiExtrato();

        System.out.println("[Log] =>Criando uma Conta Poupança, imprimindo extrato, depositando 459.25, extrato, adicionando rendimento e imprimindo extrato\n");
        ContaPoupanca  minhaPoupanca = new ContaPoupanca("Luiz Pedro", 4, 3, 0.005);
        minhaPoupanca.imprimiExtrato();
        minhaPoupanca.depositar(459.25);
        minhaPoupanca.imprimiExtrato();
        minhaPoupanca.adicionaRendimento();
        minhaPoupanca.imprimiExtrato();

        System.out.println("[Log] =>Transferindo R$50.00 da poupança para a conta corrente e imprimindo o extrato de ambas\n");
        minhaPoupanca.transfere(50.0, minhaCC);
        minhaPoupanca.imprimiExtrato();
        minhaCC.imprimiExtrato();
    }
}
