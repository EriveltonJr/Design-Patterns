public class LogisticaMaritima implements Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}