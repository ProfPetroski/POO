public class Principal {
    public static void main(String args[]){
        System.out.println("[Log] =>Criar uma Agência\n");

        Agencia novaAgencia = new Agencia(1, 800.0, 0.005);

        System.out.println("[Log => Criar uma conta Corrente e depositar R$147.00");
        ContaCorrente contaProf = novaAgencia.novaContaCorrente("Professor Luiz");
        contaProf.depositar(147.0);
        contaProf.imprimiExtrato();
        System.out.println("[Log => Cobrar a taxa da contaProf");
        novaAgencia.cobrarTaxa(contaProf);

        contaProf.imprimiExtrato();

    }
}