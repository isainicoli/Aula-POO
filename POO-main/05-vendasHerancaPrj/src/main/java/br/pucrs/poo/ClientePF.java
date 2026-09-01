package br.pucrs.poo;

public class ClientePF extends Cliente {
  private String cpf;

    public ClientePF(int umCodigo, String umNome, String umCPF) {
        super(umCodigo, umNome);
        this.cpf = umCPF;
    }

    public String getCPF() {
        return cpf;
    }

    @Override
    public String getID() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " [cpf = " + cpf + "]";
    }
}