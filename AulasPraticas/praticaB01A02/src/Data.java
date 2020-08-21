public class Data {
    byte dia;
    byte mes;
    short ano;

    void setDia(byte novoDia){
        if(novoDia<=31&&novoDia>0){
            this.dia=novoDia;
        }
        else {
            System.out.println("Dia inválido");
        }
    }
    void setMes(byte novoMes){
        if(novoMes<=12&&novoMes>0){
            this.mes=novoMes;
        }
        else {
            System.out.println("Mês inválido");
        }
    }
    void setAno(short novoAno){
        if(novoAno<=2020){
            this.ano=novoAno;
        }
        else {
            System.out.println("Ano inválido");
        }
    }
    byte getDia(){
        return this.dia;
    }
    byte getMes(){
        return this.mes;
    }
    short getAno(){
        return this.ano;
    }
    void imprimirData(){
        System.out.printf("%02d/%02d/%04d\n", this.dia, this.mes, this.ano);
    }
}
