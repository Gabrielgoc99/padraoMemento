
public class PedidoStatusEntregue implements PedidoStatus {

    private PedidoStatusEntregue() {};
    private static PedidoStatusEntregue instance = new PedidoStatusEntregue();
    public static PedidoStatusEntregue getInstance() {
        return instance;
    }

    public String getNameStatus() {
        return "Pedido Entregue!";
    }
}