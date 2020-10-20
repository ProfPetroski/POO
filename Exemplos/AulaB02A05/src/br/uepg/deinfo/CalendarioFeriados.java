package br.uepg.deinfo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import br.uepg.deinfo.data.Feriado;

public class CalendarioFeriados {

    private Feriado listaFeriados[];
    private static final int TAM=5;
    protected int teste;

    public CalendarioFeriados(){
        this.listaFeriados = new Feriado[TAM];
    }

    public void addFeriado(Feriado novoFeriado) throws ArrayIndexOutOfBoundsException{
        for (int i=0; i<TAM; i++){
            if(listaFeriados[i]==null){
                listaFeriados[i]= novoFeriado;
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException("A lista está cheia");
    }

    public void exportarFeriados() throws IOException, ArrayIndexOutOfBoundsException {
        FileWriter arq = new FileWriter("feriados.txt");
        PrintWriter out = new PrintWriter(arq);
        for(int i=0; i<TAM; i++){
            out.println("Feriado["+i+"]: \n"+this.listaFeriados[i]);
        }
        out.close();
    }
}
