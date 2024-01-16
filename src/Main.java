public class Main {
    public static void main(String[] args) {
        Logistica logisticaRodoviaria = new LogisticaRodoviaria();
        Logistica logisticaMaritima = new LogisticaMaritima();

        logisticaRodoviaria.planejarEntrega(); // Planejando a entrega: Entrega via caminhão
        logisticaMaritima.planejarEntrega();  // Planejando a entrega: Entrega via navio
    }
}