package br.pucrs.poo;

public class Ponto {
    private double coordX;
    private double coordY;

    public Ponto(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }

    public void mover(double novoX, double novoY) {
        this.coordX = novoX;
        this.coordY = novoY;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", coordX, coordY);
    }

}
