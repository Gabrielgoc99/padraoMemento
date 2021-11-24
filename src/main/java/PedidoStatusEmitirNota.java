
public class PedidoStatusEmitirNota implements PedidoStatus {

    private PedidoStatusEmitirNota() {};
    private static PedidoStatusEmitirNota instance = new PedidoStatusEmitirNota();
    public static PedidoStatusEmitirNota getInstance() {
        return instance;
    }

    public String getNameStatus() {
        return "Nota Fiscal Emitida!";
    }

    public String efetuar(Pedido pedido) {
        return "Pedido não Efetuado!";
    }

}