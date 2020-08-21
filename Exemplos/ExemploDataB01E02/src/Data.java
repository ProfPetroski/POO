/**
 * Esta classe foi implementada para armazenar
 * uma data com dia, mês e ano, e a
 * validação dos dias meses válidos
 */
public class Data {
    private byte dia;
    private byte mes;
    private short ano;

    /**
     * Este método deve ser utilizado para configurar a data através dos seguinte parâmetros
     * @param dia dia do Mês que pode ser de 1-31 nos meses Janeiro, Março, Maio, Julho, Agosto, Outubro e Dezembro
     *            Pode ser 1-30 nos meses de Abril, Junho, Setembro e Novembro
     *            e no mês de feveriro 1-28 em anos não bissextos e de 1-29 em anos bissextos
     * @param mes Mês que pode ser de 1-12
     * @param ano Ano
     */
    public void setData(byte dia, byte mes, short ano){
        if(mes<=0||mes>12){
            System.out.println("Mês inválido");
            return;
        }
        if(dia<=0||dia>31){
            System.out.println("Dia inválido");
            return;
        }else if(dia==31&&(mes==2||mes==4||mes==6||mes==9||mes==11)){
            System.out.println("Dia inválido");
            return;
        }
        else if(mes==2&&(dia==30||(!this.ehBissexto(ano)&&dia==29))){
            System.out.println("Dia inválido");
            return;
        }
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    private boolean ehBissexto(short ano){
        boolean bissexto = (ano%4==0&&ano%100!=0)||ano%400==0;
        return bissexto;
    }
    public byte getDia(){
        return this.dia;
    }
    public byte getMes(){
        return this.mes;
    }
    public short getAno(){
        return this.ano;
    }
    public int comparaCom(Data d){
        int valor1 = this.ano*10000+this.mes*100+this.dia;
        int valor2 = d.getAno()*10000+d.getMes()*100+d.getDia();
        if(valor1<valor2){
            return -1;
        }
        else if(valor1>valor2){
            return 1;
        }
        else{
            return 0;
        }
    }
    void imprimirData(){
        System.out.printf("%02d/%02d/%04d\n", this.dia, this.mes, this.ano);
    }
}
