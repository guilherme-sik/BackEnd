package Aula02_Mesas;

public class FastFood {
    public static void main(String[] args) {
        Menu adulto = new Adulto(35.00);
        adulto.preparacao();

        Menu infantil = new Infantil(28.00, 12.00);
        infantil.preparacao();

        Menu vegetariano = new Vegetariano(42.0, 15.0);
        vegetariano.preparacao();
    }
}
