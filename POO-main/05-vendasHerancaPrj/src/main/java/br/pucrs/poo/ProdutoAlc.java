package br.pucrs.poo;

public class ProdutoAlc extends Produto{
    private double taxaTrago;

    public ProdutoAlc(int umCodigo, String umNome, double umPreco, double umaTaxa){
        super(umCodigo, umNome, umPreco);
        this.taxaTrago = umaTaxa;
    }
    
    public double getTaxaTrago(){
        return this.taxaTrago;
    } 
    
    public void setTaxaTrago(double umaTaxa){
        this.taxaTrago = umaTaxa;
    }

    public static double adicionaTaxa (double umPreco, double umaTaxa){
        return umPreco + (umaTaxa * (umPreco));
    }

    @Override
    public String toString (){
        return super.toString();
    }
}