
public class PedidoStatusCancelado implements PedidoStatus {

    private PedidoStatusCancelado() {};
    private static PedidoStatusCancelado instance = new PedidoStatusCancelado();
    public static PedidoStatusCancelado getInstance() {
        return instance;
    }

    public String getNameStatus() {
        return "Pedido Cancelado!";
    }

}