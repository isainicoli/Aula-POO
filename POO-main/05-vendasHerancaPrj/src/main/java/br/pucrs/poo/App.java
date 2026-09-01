package br.pucrs.poo;

public class App {

    public static void main(String[] args) {
        Cliente c1 = new ClientePF(123, "Sr. Smith", "3.3-3");
        Cliente c2 = new ClientePJ(321, "John Doe Inc", "1001-1");
        
        CadastroClientes cadCli = CadastroClientes.getInstance();
        cadCli.inserir(c1);
        cadCli.inserir(c2);

        Cliente cliPF = new ClientePF(200, "Sra. Smith", "1.1-1");
        cadCli.inserir(cliPF);
        cadCli.inserir(new Estudante(201, "Huguinho", "2.2-2", "PUCRS"));

        System.out.println(cadCli);

        CadastroProdutos cadProd = CadastroProdutos.getInstance();

        Produto p1 = new Produto(1, "caneta azul", 2);
        Produto p2 = new Produto(2, "borracha", 1.5);
        Produto p3 = new Produto(3, "lápis", 1);
        Produto p4 = new Produto(4, "Chocolate", 10);

        cadProd.inserir(p1);
        cadProd.inserir(p2);
        cadProd.inserir(p3);
        cadProd.inserir(p4);

        System.out.println(cadProd.toString());

        Venda v1 = new Venda(cadCli.pesquisar(321));
        v1.inserir(p1);
        v1.inserir(10, p2);
        v1.inserir(cadProd.pesquisar(1));
        v1.inserir(10, cadProd.pesquisar(4));

        System.out.println();
        System.out.println(v1.getNotaFiscal());

        Venda v2 = new Venda(cadCli.pesquisar(201));
        v2.inserir(cadProd.pesquisar(2));
        v2.inserir(5, cadProd.pesquisar(3));

        System.out.println(v2.getNotaFiscal());

        Venda v3 = new Venda(cadCli.pesquisar(200));
        v3.inserir(cadProd.pesquisar(4));

        System.out.println(v3.getNotaFiscal());

        System.out.println("\n\nPróxima venda será a de número: " + Venda.getProxNF());
        
        System.out.println("\n--------------------------------");

        Cliente clienteCPF = cadCli.pesquisar("1.1-1");
        if (clienteCPF != null) {
            System.out.println("Cliente encontrado pelo CPF:\n" + clienteCPF);
        } else {
            System.out.println("Cliente CPF não encontrado.");
        }

        System.out.println("\n--------------------------------");

        Cliente clienteCNPJ = cadCli.pesquisar("1001-1");
        if (clienteCNPJ != null) {
            System.out.println("Cliente encontrado pelo CNPJ:\n" + clienteCNPJ);
        } else {
            System.out.println("Cliente CNPJ não encontrado.");
        }

        System.out.println("\n--------------------------------");

        ProdutoEE eletronico = new ProdutoEE(101, "Notebook Acer Aspire", 5500, 90);
        System.out.println(eletronico);
        System.out.println(eletronico.getGarantia());
        
        System.out.println("\n--------------------------------");

        ProdutoAlc bebida = new ProdutoAlc(401, "Cabernet Sauvignon", 70.00);
        System.out.println(bebida);
        System.out.println("Imposto atual - " + ProdutoAlc.getImpostoAlcool());
        System.out.println("Preço com imposto - R$ " + bebida.getPreco() + "\n");
        
        ProdutoAlc.setImpostoAlcool(5.0);
        System.out.println("Novo imposto - " + ProdutoAlc.getImpostoAlcool());
        System.out.println("Novo preço - R$ " + bebida.getPreco() + "\n");
    }
}