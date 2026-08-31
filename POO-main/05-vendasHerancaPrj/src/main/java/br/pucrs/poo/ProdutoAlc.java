package br.pucrs.poo;

public class ProdutoAlc extends Produto{

    public ProdutoAlc(int umCodigo, String umNome, double umPreco){
        super(umCodigo, umNome, umPreco);
    }

    public static double taxaTrago (double umPreco){
        double taxaTrago = 4;
        return umPreco + (taxaTrago * (umPreco));
    }

    @Override
    public String toString (){
        return super.toString();
    }
}