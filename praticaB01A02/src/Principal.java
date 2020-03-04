public class Principal {
    public static void main(String[] args){

        Funcionario luiz = new Funcionario();
        luiz.nome = "Luiz Pedro Petroski";
        luiz.cpf = "00000000000";
        luiz.cargo = "Professor";
        luiz.salario = 1000.00;
        luiz.ativo = true;
        luiz.dataNascimento = new Data();
        luiz.dataNascimento.dia = 1;
        luiz.dataNascimento.mes = 1;
        luiz.dataNascimento.ano = 2000;
        luiz.imprimirInformacoes();

        System.out.println("-----------------------------------");

        Funcionario pedro = new Funcionario();
        pedro.nome = "Pedro Silva";
        pedro.cpf = "11111111111";
        pedro.cargo = "Coordenador de curso";
        pedro.salario = 2000.00;
        pedro.ativo = true;
        pedro.setDataNascimento((byte)2, (byte)2, (short)2001);
        pedro.imprimirInformacoes();

        System.out.println("-----------------------------------");

        Funcionario carlos = new Funcionario();
        carlos.nome = "Carlos Souza";
        carlos.cpf = "22222222222";
        carlos.cargo = "Diretor";
        carlos.salario = 2500.00;
        carlos.ativo = true;
        Data nascimento = new Data();
        nascimento.setDia((byte)3);
        nascimento.setMes((byte)3);
        nascimento.setAno((short)2002);
        carlos.setDataNascimento(nascimento);
        carlos.imprimirInformacoes();

        System.out.println("-----------------------------------");
        //Tentando acessar diretamente os atributos da data...
        luiz.dataNascimento.mes=13;
        luiz.imprimirInformacoes();
        //A data foi setada inválida!

        System.out.println("-----------------------------------");
        //Utilizando o método e tentando colocar uma data inválida
        carlos.dataNascimento.setDia((byte)35);
        carlos.imprimirInformacoes();
        //A data inválida não foi atribuida

    }
}
