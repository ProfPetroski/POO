public class Principal {
    public static void main(String[] args){
        Data d1 = new Data();
        d1.setData((byte)25,(byte)01,(short)2022);
        d1.imprimirData();

        Data d2 = new Data();
        d2.setData((byte)25,(byte)01,(short)2022);
        d2.imprimirData();

        Data d3 = new Data();
        d3.setData((byte)29,(byte)11,(short)2021);
        d3.imprimirData();

        System.out.println(d1.comparaCom(d2));
        System.out.println(d1.comparaCom(d3));
        System.out.println(d3.comparaCom(d1));

        d1.setData((byte)29,(byte)02,(short)2019);
        d1.imprimirData();

        d1.setData((byte)31,(byte)01,(short)2020);
        d1.imprimirData();

        d1.setData((byte)31,(byte)02,(short)2020);
        d1.imprimirData();

        d1.setData((byte)31,(byte)04,(short)2020);
        d1.imprimirData();
    }
}
