public interface Logistica {
    Transporte criarTransporte();

    default void planejarEntrega() {
        Transporte transporte = criarTransporte();
        System.out.println("Planejando a entrega: " + transporte.entregar());
    }
}
