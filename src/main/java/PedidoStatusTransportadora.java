
public class PedidoStatusTransportadora implements PedidoStatus {

    private PedidoStatusTransportadora() {};
    private static PedidoStatusTransportadora instance = new PedidoStatusTransportadora();
    public static PedidoStatusTransportadora getInstance() {
        return instance;
    }

    public String getNameStatus() {
        return "Pedido Enviado à Transportadora!";
    }



}