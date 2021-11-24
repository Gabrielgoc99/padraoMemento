
public class PedidoStatusEfetuado implements PedidoStatus {

    private PedidoStatusEfetuado() {};
    private static PedidoStatusEfetuado instance = new PedidoStatusEfetuado();
    public static PedidoStatusEfetuado getInstance() {
        return instance;
    }

    public String getNameStatus() {
        return "Pedido Efetuado!";
    }

}