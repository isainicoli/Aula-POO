package br.pucrs.poo;

import java.util.ArrayList;

public class CadastroClientes {
   private ArrayList<Cliente> lista;

    private CadastroClientes() {
        lista = new ArrayList<>();
    }

    private static CadastroClientes instance;

    public static CadastroClientes getInstance() {
        if (instance == null) {
            instance = new CadastroClientes();
        }
        return instance;
    }

    public void inserir(Cliente cli) {
        lista.add(cli);
    }

    public Cliente pesquisar(int cod) {
        for (Cliente cli : lista) {
            if (cli.getCodigo() == cod)
                return cli;
        }
        return null;
    }

    public Cliente pesquisar(String id) {
        for (Cliente cli : lista) {
            if (cli.getID().equals(id))
                return cli;
        }
        return null;
    }

    public String toString() {
        StringBuilder aux = new StringBuilder(
                "\nCadastro de Clientes\n- - - - - - - - - - -\n");

        for (Cliente umCliente : lista) {
            aux.append(umCliente.toString() + "\n");
        }

        return aux.toString();
    }
}