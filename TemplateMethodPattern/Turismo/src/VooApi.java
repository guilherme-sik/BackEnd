public class VooApi {

    // Procurar os voos de acordo com uma data pré-definida
    public void buscarVoos(String dataPartida, String dataRetorno, String origem, String destino){
        System.out.println("=================================");
        System.out.println("Voos encontrados para: " + destino + " saindo de " + origem);
        System.out.println("Data Partida: " + dataPartida + " - Data Retorno: " + dataRetorno);
    }
}
