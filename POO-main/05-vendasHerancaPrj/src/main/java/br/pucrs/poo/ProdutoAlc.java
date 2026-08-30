
public class ProdutoAlc extends Produto{
    private double taxaTrago;


    public ProdutoAlc(int umCodigo, String umNome, double umPreco){
        super(umCodigo, umNome, umPreco);
    }

    public static double taxaTrago (double umPreco){
        return umPreco + (4 * umPreco);
    }

    @Override
    public String toString (){
        return "!!Produto com taxa-trago!! \n" + super.toString();
    }
}