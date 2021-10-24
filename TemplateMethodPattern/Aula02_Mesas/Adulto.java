package Aula02_Mesas;

public class Adulto extends Menu{
    private double precoBase;

    public Adulto(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public void montar(double valor) {
        System.out.println("Menu Adulto - Sem adicionais!");
        System.out.println("Valor do combo: R$" + valor);
    }

    @Override
    public double calcularPrecoVenda() {
        return precoBase;
    }
}
