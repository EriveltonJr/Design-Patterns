public class LogisticaRodoviaria implements Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}