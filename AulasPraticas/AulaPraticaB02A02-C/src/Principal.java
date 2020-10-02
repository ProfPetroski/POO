public class Principal {
    public static void main(String args[]){
        System.out.println("____________________________________");
        System.out.println("[Log] =>Criar uma Agência\n");

        Agencia novaAgencia = new Agencia(1, 800.0, 0.005);

        Conta c;
        ContaCorrente cc;

        //c = new Conta("Luiz", 1, 1); Não funciona pois é abstrato
        cc = new ContaCorrente("Luiz", 1, 1, 500.0);
        c  = cc;
        c.setNomeTitular("Luiz Pedro da Silva");

        Conta vetorConta[] = new Conta[10];
        //vetorConta[0] = new Conta("José", 1, 2); não posso fazer
        vetorConta[1] = new ContaCorrente("Luiz", 1, 3, 100.0);
        vetorConta[2] = new ContaPoupanca("Pedro", 1, 4, 0.005);
        vetorConta[1].setNomeTitular("Luiz Pedro Petroski");
        System.out.println("____________________________________");
        System.out.println("[LOG]=> Testando criar vetor:");
        System.out.println(vetorConta[1]);


        System.out.println("____________________________________");
        System.out.println("[Log] => Criar duas contas correntes e duas contas poupanças");
        novaAgencia.novaContaCorrente("Luiz Pedro Petroski");
        novaAgencia.novaContaCorrente("Maria da Silva");
        novaAgencia.novaContaPoupanca("Pedro da Silva");
        novaAgencia.novaContaPoupanca("Julia da Silva");

        System.out.println("____________________________________");
        System.out.println("[Log] => Depositar um valor em cada conta criada");
        novaAgencia.getListaContaPoupanca()[0].depositar(400.61);
        novaAgencia.getListaContaPoupanca()[1].depositar(800.10);
        novaAgencia.getListaContaCorrente()[0].depositar(2400.97);
        novaAgencia.getListaContaCorrente()[1].depositar(1345.32);

        System.out.println("____________________________________");
        System.out.println("[Log] => Cobrar a taxa de duas contas");
        novaAgencia.cobrarTaxa(novaAgencia.getListaContaPoupanca()[0]);
        novaAgencia.cobrarTaxa(novaAgencia.getListaContaCorrente()[0]);
        System.out.println("____________________________________");
        System.out.println("[Log] => Fazer a transferência entre duas contas");
        novaAgencia.getListaContaCorrente()[1].transfere(100.0, novaAgencia.getListaContaCorrente()[0]);
        System.out.println("____________________________________");
        System.out.println("[Log] => Fazer o balanço das contas correntes");
        double balancoC = novaAgencia.balanco(novaAgencia.getListaContaCorrente());
        System.out.println(balancoC);

        System.out.println("____________________________________");
        System.out.println("[Log => Fazer o balanço das contas Poupanças");
        double balancoP = novaAgencia.balanco(novaAgencia.getListaContaPoupanca());
        System.out.println(balancoP);

    }
}