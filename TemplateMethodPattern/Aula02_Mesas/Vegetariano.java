package Aula02_Mesas;

public class Vegetariano extends Menu{
    private double precoBase;
    private double embalagem;

    public Vegetariano(double precoBase, double embalagem) {
        this.precoBase = precoBase;
        this.embalagem = embalagem;
    }

    @Override
    public void montar(double valor) {
        System.out.println("Menu vegetariano - Embalagem especial + condimentos!");
        System.out.println("Valor do combo: R$" + valor);
    }

    @Override
    public double calcularPrecoVenda() {
        return (precoBase + embalagem) * 1.01;
    }
}
