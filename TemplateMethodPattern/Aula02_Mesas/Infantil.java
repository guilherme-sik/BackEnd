package Aula02_Mesas;

public class Infantil extends Menu{
    private double precoBase;
    private double valorPresente;


    public Infantil(double precoBase, double valorPresente) {
        this.precoBase = precoBase;
        this.valorPresente = valorPresente;
    }

    @Override
    public void montar(double valor) {
        System.out.println("Menu infantil - presente incluso!");
        System.out.println("Valor do combo: R$" + valor);
    }

    @Override
    public double calcularPrecoVenda() {
        return valorPresente + precoBase;
    }
}
