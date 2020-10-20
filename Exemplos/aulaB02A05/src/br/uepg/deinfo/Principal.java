package br.uepg.deinfo;
import br.uepg.deinfo.ensino.Professor;

public class Principal {
    public static void main(String args[]){
        System.out.println("[LOG]=> Criar dois objetos do tipo funcionario f1 e f2");
        Funcionario f1 = new Funcionario("Luiz", 25, 900.0);
        Funcionario f2 = new Funcionario("Pedro", 30, 900.0);

        System.out.println("[LOG]=> Comparar o funcionário f1 e f2 ");
        System.out.println(f1.ehMaiorQue(f2));
        System.out.println("[LOG]=> Executar o método default da interface");
        f1.imprimirComparacao(f2);

        System.out.println("[LOG]=> Criar dois objetos do tipo Professor f1 e f2");
        Professor p1 = new Professor("Marcio", 35, 3000.0, "DEINFO");
        Professor p2 = new Professor("Luiz", 25, 4000.0, "DEINFO");

        System.out.println("[LOG]=> Executar os métodos autentica e autoriza");
        System.out.println(p1.autentica("123"));
        System.out.println(p1.autoriza("Professor"));

        System.out.println("[LOG]=> Executar o método compareTo ( Comparable -> interface das bibliotecas java)");
        System.out.println(p1.compareTo(p2));
    }
}
