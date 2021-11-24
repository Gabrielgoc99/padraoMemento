
public class PedidoStatusEmSeparacao implements PedidoStatus {

    private PedidoStatusEmSeparacao() {};
    private static PedidoStatusEmSeparacao instance = new PedidoStatusEmSeparacao();
    public static PedidoStatusEmSeparacao getInstance() {
        return instance;
    }

    public String getNameStatus() {
        return "Pedido Separado!";
    }

}