
public abstract class Imovel{
    private String proprietario;
    private int areaConstruida;

    public Imovel(String umProprietario, int umaArea){
        this.proprietario = umProprietario;
        this.areaConstruida = umaArea;
    }

    public String getProprietario (){
        return proprietario;
    }

    public int getArea(){
        return areaConstruida;
    }

    public static double calculaImposto(){
        return;
    }

    public String toString(){
        return String.format("(%s) /t %i", proprietario, areaConstruida);    } 

}
