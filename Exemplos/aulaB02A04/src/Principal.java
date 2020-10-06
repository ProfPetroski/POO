import java.io.IOException;

public class Principal {

    public static void main(String args[]){
        Feriado f = new Feriado("Dia das crianças", 12, 10, 2020);

        CalendarioFeriados meuCalendario = new CalendarioFeriados();
        try {
            meuCalendario.addFeriado(f);
            meuCalendario.addFeriado(new Feriado("Teste1", 1, 1, 2020));
            meuCalendario.addFeriado(new Feriado("Teste2", 1, 1, 2020));
            meuCalendario.addFeriado(new Feriado("Teste3", 1, 1, 2020));
            meuCalendario.addFeriado(new Feriado("Teste4", 1, 1, 2020));
            meuCalendario.addFeriado(new Feriado("Teste5", 1, 1, 2020));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }



        try{
            meuCalendario.exportarFeriados();
        } catch (IOException e){
            System.out.println("Erro de IO");
            System.out.println(e.getMessage());

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro de Limites do vetor");
            System.out.println(e.getMessage());

        }

    }
}
