
public class Professor extends Funcionario implements Autenticavel, Comparable{
    private String departamento;

    public Professor(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    public int autentica(String senha){
        if(senha.equals("123")){
            return 1;
        }
        else{
            return 0;
        }
    }
    public int autoriza(String cargo){
        if(cargo.equals("Professor")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int compareTo(Object other){
        Professor outroProfesor = (Professor)other;
        if(this.getSalario()>outroProfesor.getSalario()){
            return 1;
        }
        else if(this.getSalario()<outroProfesor.getSalario()){
            return -1;
        }
        else{
            return 0;
        }
    }


}

