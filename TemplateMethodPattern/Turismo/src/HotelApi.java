public class HotelApi {

    // Procurar os hotéis de acordo com uma data pré-definida
    public void buscarHoteis(String dataEntrada, String dataSaida, String cidade){
        System.out.println("=================================");
        System.out.println("Hotéis encontrados: " + cidade);
        System.out.println("Entrada: " + dataEntrada + " - Saída: " + dataSaida);
    }
}
