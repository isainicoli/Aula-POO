
public class ProdutoEE extends Produto{
    private int diasGarantia;

    public ProdutoEE (int umCodigo, String umNome, double umPreco, int diasGarantia){
        super(umCodigo, umNome, umPreco);
        this.diasGarantia = diasGarantia;
    }

    public int getGarantia(){
        return diasGarantia;
    }

    @Override
    public String toString (){  
        return super.toString() + this.diasGarantia;
    }
}