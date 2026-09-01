package br.pucrs.poo;

public class ProdutoAlc extends Produto{
     private static double impostoAlcool = 4.0;

    public ProdutoAlc(int umCodigo, String umNome, double umPreco) {
        super(umCodigo, umNome, umPreco);
    }

    public static double getImpostoAlcool() {
        return impostoAlcool;
    }

    public static void setImpostoAlcool(double novoImposto) {
        impostoAlcool = novoImposto;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + (super.getPreco() * impostoAlcool);
    }

   @Override
    public String toString() {
    return String.format(
            "%s\n" +
            "Preço base- R$ %.2f\n" +
            "Imposto sobre álcool- %.2f%%\n" +
            "Preço com imposto- R$ %.2f",
            super.toString(),
            super.getPreco(),
            impostoAlcool * 100,
            getPreco());
    }
}