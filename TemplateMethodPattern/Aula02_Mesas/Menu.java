package Aula02_Mesas;

public abstract class Menu {

    public void preparacao(){
        double valor = calcularPrecoVenda();
        montar(valor);
    }

    public abstract void montar(double valor);
    public abstract double calcularPrecoVenda();

}
