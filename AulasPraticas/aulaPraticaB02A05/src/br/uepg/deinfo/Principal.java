package br.uepg.deinfo;

import br.uepg.deinfo.sysacad.Academico;
import br.uepg.deinfo.sysacad.Orientador;
import br.uepg.deinfo.systcc.TrabalhoConclusaoCurso;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]){
        TrabalhoConclusaoCurso listaTCC[];
        listaTCC = new TrabalhoConclusaoCurso[10];

        String valor;
        TrabalhoConclusaoCurso novoTCC;
        valor = JOptionPane.showInputDialog("Qual é o titulo do TCC?", null);
        novoTCC = new TrabalhoConclusaoCurso(valor);
        String nome = JOptionPane.showInputDialog("Qual é o Nome do Acadêmico 1:", null);
        String ra = JOptionPane.showInputDialog("Qual é o RA do Acadêmico 1:", null);
        Academico  academico1 = new Academico(nome, ra);

        novoTCC.addAcademico(academico1);

        String nomeOrientador = JOptionPane.showInputDialog("Qual é o Nome do Orientador:", null);
        String area = JOptionPane.showInputDialog("Qual é a área temática do orientador:", null);
        Orientador orientador = new Orientador(nomeOrientador, area);

        novoTCC.setOrientador(orientador);

        //System.out.println(novoTCC);
        JOptionPane.showMessageDialog(null, novoTCC);


        // Continuar...
    }
}
